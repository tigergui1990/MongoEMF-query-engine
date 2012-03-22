/*******************************************************************************
 * Copyright (c) 2011 Bryan Hunt & Ed Merks.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt & Ed Merks - initial API and implementation
 *******************************************************************************/


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.UnknownHostException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipselabs.mongo.query.MongoSQLStandaloneSetup;
import org.eclipselabs.mongo.query.query.AndWhereEntry;
import org.eclipselabs.mongo.query.query.Expression;
import org.eclipselabs.mongo.query.query.ExpressionWhereEntry;
import org.eclipselabs.mongo.query.query.LongExpression;
import org.eclipselabs.mongo.query.query.Operator;
import org.eclipselabs.mongo.query.query.StringExpression;
import org.eclipselabs.mongo.query.query.WhereEntry;
import org.eclipselabs.mongo.query.query.impl.ModelImpl;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Injector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

/**
 * @author Tiger Gui
 * 
 */
public class TigerGuiTestQuery 
{
	

	
/*	@Test
	public void add()
	{
		ResourceSet resourceSet = new ResourceSetImpl();
		EList uriHandlers = resourceSet.getURIConverter().getURIHandlers();
		uriHandlers.add(0, new MongoURIHandlerImpl());

		

		Resource resource = resourceSet.createResource(URI.createURI("mongo://localhost/tigergui/users/"));
		
		for(int i = 0; i < 10; i++)
		{
			Person user = ModelFactory.eINSTANCE.createPerson();
			user.setName("Test User" + i);
			resource.getContents().add(user);
		}

		try
		{
		  resource.save(null);
		}
		catch(IOException e)
		{
		  e.printStackTrace();
		}
	}*/

	
	@Test
	public void query(){
		//Transfer query language => EMF query model
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new MongoSQLStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.mongosql"));
		InputStream in = new ByteArrayInputStream("SELECT * FROM mongo://localhost:27017/tigergui/users WHERE name='Test User7' AND age>2".getBytes());
		try {
			resource.load(in, resourceSet.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		ModelImpl model = (ModelImpl) resource.getContents().get(0);		
		//Transfer EMF query model => DBObject
        Mongo m = null;
		try {
			m = new Mongo( model.getDb().getUrl(), (int) model.getDb().getPort());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MongoException e) {
			e.printStackTrace();
		}
        
		DB db = m.getDB(model.getDb().getDbName());
        DBCollection coll = db.getCollection(model.getDb().getName());
        BasicDBObject query = (BasicDBObject) tansferModule(model);
        
        /*EList<Condition> list = model.getQuery().getCond();
        for(Condition cond : list)
        	if(cond.getComp().equals("=")){
        		String value = cond.getValue();
        		if(value.startsWith("'")&&value.endsWith("'") || value.startsWith("\"")&&value.endsWith("\""))
        			value =value.substring(1, value.length()-1);
        		query.put(cond.getName(), value);
        	}else if(cond.getComp().equals(">")){
        		query.put(cond.getName(), new BasicDBObject("$gt", Integer.parseInt(cond.getValue())));
        	}*/
        //Query MongoDB by DBObject
        DBCursor cur = coll.find(query);
        while(cur.hasNext()) {
            System.out.println(cur.next());
        }
	}
	
	private DBObject tansferModule(ModelImpl model){
		BasicDBObject query = new BasicDBObject();
		WhereEntry rootEntry =model.getWhereEntry();
		if(rootEntry instanceof ExpressionWhereEntry)
			transferExpressionWhereEntry(rootEntry, query);
		else if(rootEntry instanceof AndWhereEntry)
			transferAndWhereEntry(rootEntry, query);
		return query;
	}
	
	private void transferAndWhereEntry(WhereEntry entry, DBObject query){
		AndWhereEntry root = (AndWhereEntry) entry;
		EList<WhereEntry> list = root.getEntries();
		for(WhereEntry e : list)
			if(e instanceof ExpressionWhereEntry)
				transferExpressionWhereEntry(e, query);
	}
	
	private void transferExpressionWhereEntry(WhereEntry entry, DBObject query){
		ExpressionWhereEntry expression = (ExpressionWhereEntry) entry;
		
		if(expression.getOperator() == Operator.EQUAL)
			query.put(expression.getName(), getValue(expression.getRhs()));
		else if(expression.getOperator() == Operator.GREATER_THEN)
			query.put(expression.getName(), new BasicDBObject("$gt", Integer.parseInt(getValue(expression.getRhs()).toString())));
	}
	
	private Object getValue(Expression expr){
		if(expr instanceof StringExpression)
			return ((StringExpression) expr).getValue();
		else if(expr instanceof LongExpression)
			return ((LongExpression) expr).getValue();
		return null;
	}
	
	/*@Test
	public void query2(){
		ResourceSet resourceSet = MongoUtil.createResourceSet();
		Resource resource = resourceSet.getResource(createQueryURI(ModelPackage.Literals.PERSON, "name=='Test User7'"), true);
		
		Result result = (Result) resource.getContents().get(0);

		for(EObject eObject : result.getValues())
		{
		  Person user = (Person) eObject;
		  System.out.println("----query2-------User " + user.getName() + " has URI: " +user.eResource().getURI());
		}
	}
	
	private URI createQueryURI(EClass eClass, String query)
	{
		System.out.println(eClass.getName());
		return URI.createURI("mongo://localhost/tigergui/users/").appendQuery(URI.encodeQuery(query, false));
	}*/
	
	
}
