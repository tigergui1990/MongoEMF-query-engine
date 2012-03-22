package org.eclipselabs.mongo.query.serializer;

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
import org.eclipselabs.mongo.query.query.AndWhereEntry;
import org.eclipselabs.mongo.query.query.BooleanExpression;
import org.eclipselabs.mongo.query.query.Database;
import org.eclipselabs.mongo.query.query.DateExpression;
import org.eclipselabs.mongo.query.query.DoubleExpression;
import org.eclipselabs.mongo.query.query.ExpressionWhereEntry;
import org.eclipselabs.mongo.query.query.LongExpression;
import org.eclipselabs.mongo.query.query.Model;
import org.eclipselabs.mongo.query.query.NullExpression;
import org.eclipselabs.mongo.query.query.OrWhereEntry;
import org.eclipselabs.mongo.query.query.QueryPackage;
import org.eclipselabs.mongo.query.query.ReplacableValue;
import org.eclipselabs.mongo.query.query.StringExpression;
import org.eclipselabs.mongo.query.services.MongoSQLGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractMongoSQLSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected MongoSQLGrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == QueryPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case QueryPackage.AND_WHERE_ENTRY:
				if(context == grammarAccess.getAndWhereEntryRule() ||
				   context == grammarAccess.getAndWhereEntryAccess().getAndWhereEntryEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteWhereEntryRule() ||
				   context == grammarAccess.getParWhereEntryRule() ||
				   context == grammarAccess.getWhereEntryRule() ||
				   context == grammarAccess.getWhereEntryAccess().getOrWhereEntryEntriesAction_1_0()) {
					sequence_AndWhereEntry(context, (AndWhereEntry) semanticObject); 
					return; 
				}
				else break;
			case QueryPackage.BOOLEAN_EXPRESSION:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_BooleanExpression(context, (BooleanExpression) semanticObject); 
					return; 
				}
				else break;
			case QueryPackage.DATABASE:
				if(context == grammarAccess.getDatabaseRule()) {
					sequence_Database(context, (Database) semanticObject); 
					return; 
				}
				else break;
			case QueryPackage.DATE_EXPRESSION:
				if(context == grammarAccess.getDateExpressionRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_DateExpression(context, (DateExpression) semanticObject); 
					return; 
				}
				else break;
			case QueryPackage.DOUBLE_EXPRESSION:
				if(context == grammarAccess.getDoubleExpressionRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_DoubleExpression(context, (DoubleExpression) semanticObject); 
					return; 
				}
				else break;
			case QueryPackage.EXPRESSION_WHERE_ENTRY:
				if(context == grammarAccess.getAndWhereEntryRule() ||
				   context == grammarAccess.getAndWhereEntryAccess().getAndWhereEntryEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteWhereEntryRule() ||
				   context == grammarAccess.getExpressionWhereEntryRule() ||
				   context == grammarAccess.getParWhereEntryRule() ||
				   context == grammarAccess.getWhereEntryRule() ||
				   context == grammarAccess.getWhereEntryAccess().getOrWhereEntryEntriesAction_1_0()) {
					sequence_ExpressionWhereEntry(context, (ExpressionWhereEntry) semanticObject); 
					return; 
				}
				else break;
			case QueryPackage.LONG_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLongExpressionRule()) {
					sequence_LongExpression(context, (LongExpression) semanticObject); 
					return; 
				}
				else break;
			case QueryPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case QueryPackage.NULL_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNullExpressionRule()) {
					sequence_NullExpression(context, (NullExpression) semanticObject); 
					return; 
				}
				else break;
			case QueryPackage.OR_WHERE_ENTRY:
				if(context == grammarAccess.getAndWhereEntryRule() ||
				   context == grammarAccess.getAndWhereEntryAccess().getAndWhereEntryEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteWhereEntryRule() ||
				   context == grammarAccess.getParWhereEntryRule() ||
				   context == grammarAccess.getWhereEntryRule() ||
				   context == grammarAccess.getWhereEntryAccess().getOrWhereEntryEntriesAction_1_0()) {
					sequence_WhereEntry(context, (OrWhereEntry) semanticObject); 
					return; 
				}
				else break;
			case QueryPackage.REPLACABLE_VALUE:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getReplacableValueRule()) {
					sequence_ReplacableValue(context, (ReplacableValue) semanticObject); 
					return; 
				}
				else break;
			case QueryPackage.STRING_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getStringExpressionRule()) {
					sequence_StringExpression(context, (StringExpression) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (entries+=AndWhereEntry_AndWhereEntry_1_0 entries+=ConcreteWhereEntry+)
	 */
	protected void sequence_AndWhereEntry(EObject context, AndWhereEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (true='true' | true='false')
	 */
	protected void sequence_BooleanExpression(EObject context, BooleanExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (url=ID port=SINGED_LONG? dbName=ID name=ID)
	 */
	protected void sequence_Database(EObject context, Database semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=DATE
	 */
	protected void sequence_DateExpression(EObject context, DateExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QueryPackage.Literals.DATE_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.DATE_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDateExpressionAccess().getValueDATETerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=SIGNED_DOUBLE
	 */
	protected void sequence_DoubleExpression(EObject context, DoubleExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QueryPackage.Literals.DOUBLE_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.DOUBLE_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoubleExpressionAccess().getValueSIGNED_DOUBLETerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID operator=Operator rhs=Expression)
	 */
	protected void sequence_ExpressionWhereEntry(EObject context, ExpressionWhereEntry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QueryPackage.Literals.EXPRESSION_WHERE_ENTRY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.EXPRESSION_WHERE_ENTRY__NAME));
			if(transientValues.isValueTransient(semanticObject, QueryPackage.Literals.EXPRESSION_WHERE_ENTRY__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.EXPRESSION_WHERE_ENTRY__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, QueryPackage.Literals.EXPRESSION_WHERE_ENTRY__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.EXPRESSION_WHERE_ENTRY__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionWhereEntryAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getExpressionWhereEntryAccess().getOperatorOperatorEnumRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getExpressionWhereEntryAccess().getRhsExpressionParserRuleCall_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=SINGED_LONG
	 */
	protected void sequence_LongExpression(EObject context, LongExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QueryPackage.Literals.LONG_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.LONG_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLongExpressionAccess().getValueSINGED_LONGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (attrs=ColumnList db=Database whereEntry=WhereEntry?)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value='null'
	 */
	protected void sequence_NullExpression(EObject context, NullExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QueryPackage.Literals.NULL_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.NULL_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNullExpressionAccess().getValueNullKeyword_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value='?'
	 */
	protected void sequence_ReplacableValue(EObject context, ReplacableValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QueryPackage.Literals.REPLACABLE_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.REPLACABLE_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReplacableValueAccess().getValueQuestionMarkKeyword_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringExpression(EObject context, StringExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QueryPackage.Literals.STRING_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.STRING_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringExpressionAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (entries+=WhereEntry_OrWhereEntry_1_0 entries+=AndWhereEntry+)
	 */
	protected void sequence_WhereEntry(EObject context, OrWhereEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
