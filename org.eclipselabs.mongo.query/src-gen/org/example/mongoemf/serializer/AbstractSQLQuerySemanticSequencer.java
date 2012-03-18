package org.example.mongoemf.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.example.mongoemf.sQLQuery.Condition;
import org.example.mongoemf.sQLQuery.Database;
import org.example.mongoemf.sQLQuery.Model;
import org.example.mongoemf.sQLQuery.QueryCondition;
import org.example.mongoemf.sQLQuery.SQLQueryPackage;
import org.example.mongoemf.services.SQLQueryGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractSQLQuerySemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected SQLQueryGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SQLQueryPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SQLQueryPackage.CONDITION:
				if(context == grammarAccess.getConditionRule()) {
					sequence_Condition(context, (Condition) semanticObject); 
					return; 
				}
				else break;
			case SQLQueryPackage.DATABASE:
				if(context == grammarAccess.getDatabaseRule()) {
					sequence_Database(context, (Database) semanticObject); 
					return; 
				}
				else break;
			case SQLQueryPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case SQLQueryPackage.QUERY_CONDITION:
				if(context == grammarAccess.getQueryConditionRule()) {
					sequence_QueryCondition(context, (QueryCondition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID comp=COMPARE value=VALUE)
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SQLQueryPackage.Literals.CONDITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SQLQueryPackage.Literals.CONDITION__NAME));
			if(transientValues.isValueTransient(semanticObject, SQLQueryPackage.Literals.CONDITION__COMP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SQLQueryPackage.Literals.CONDITION__COMP));
			if(transientValues.isValueTransient(semanticObject, SQLQueryPackage.Literals.CONDITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SQLQueryPackage.Literals.CONDITION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConditionAccess().getCompCOMPAREParserRuleCall_1_0(), semanticObject.getComp());
		feeder.accept(grammarAccess.getConditionAccess().getValueVALUEParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (url=ID port=INT? dbName=ID name=ID)
	 */
	protected void sequence_Database(EObject context, Database semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attrs=ColumnList db=Database query=QueryCondition?)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cond+=Condition cond+=Condition*)
	 */
	protected void sequence_QueryCondition(EObject context, QueryCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
