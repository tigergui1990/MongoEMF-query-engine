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

package org.eclipselabs.mongo.query.junit;

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
import org.eclipselabs.mongo.emf.MongoURIHandlerImpl;
import org.eclipselabs.mongo.emf.junit.model.ModelFactory;
import org.eclipselabs.mongo.emf.junit.model.Person;
import org.eclipselabs.mongo.emf.junit.support.TestHarness;
import org.example.mongoemf.SQLQueryStandaloneSetup;
import org.example.mongoemf.sQLQuery.Condition;
import org.example.mongoemf.sQLQuery.impl.ModelImpl;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Injector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

/**
 * @author Tiger Gui
 * 
 */
public class TigerGuiTestQuery extends TestHarness
{
	@Before
	public void setUp() throws UnknownHostException, MongoException
	{
		super.setUp();

	
	}

	
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

	//@Test
	public void addItems(){
		 Mongo m = null;
			try {
				m = new Mongo( "localhost", 27017);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (MongoException e) {
				e.printStackTrace();
			}
	        DB db = m.getDB("tigergui");
	        DBCollection coll = db.getCollection("users");
		for(int i = 1; i < 11; i++)
		{
        	BasicDBObject doc = new BasicDBObject();
            doc.put("name", "Test User" + i);
            doc.put("age", i);
            coll.insert(doc);
		}
	}
	
	@Test
	public void query(){
		//Transfer query language => EMF query model
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new SQLQueryStandaloneSetup().createInjectorAndDoEMFRegistration();
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
		System.out.println(model.getDb().getDbName());
		//Transfer EMF query model => DBObject
        Mongo m = null;
		try {
			m = new Mongo( model.getDb().getUrl(), model.getDb().getPort());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MongoException e) {
			e.printStackTrace();
		}
        DB db = m.getDB(model.getDb().getDbName());
        DBCollection coll = db.getCollection(model.getDb().getName());
        BasicDBObject query = new BasicDBObject();
        EList<Condition> list = model.getQuery().getCond();
        for(Condition cond : list)
        	if(cond.getComp().equals("=")){
        		String value = cond.getValue();
        		if(value.startsWith("'")&&value.endsWith("'") || value.startsWith("\"")&&value.endsWith("\""))
        			value =value.substring(1, value.length()-1);
        		query.put(cond.getName(), value);
        	}else if(cond.getComp().equals(">")){
        		query.put(cond.getName(), new BasicDBObject("$gt", Integer.parseInt(cond.getValue())));
        	}
        //Query MongoDB by DBObject
        DBCursor cur = coll.find(query);
        while(cur.hasNext()) {
            System.out.println(cur.next());
        }
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
