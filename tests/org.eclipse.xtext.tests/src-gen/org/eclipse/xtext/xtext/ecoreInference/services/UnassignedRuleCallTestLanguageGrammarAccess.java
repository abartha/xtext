/*
* generated by Xtext
*/
package org.eclipse.xtext.xtext.ecoreInference.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class UnassignedRuleCallTestLanguageGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cModelFeaturesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cModelFeaturesModelFeaturesParserRuleCall_2_0 = (RuleCall)cModelFeaturesAssignment_2.eContents().get(0);
		
		//Model:
		//	"model" INT+ modelFeatures=ModelFeatures;
		public ParserRule getRule() { return rule; }

		//"model" INT+ modelFeatures=ModelFeatures
		public Group getGroup() { return cGroup; }

		//"model"
		public Keyword getModelKeyword_0() { return cModelKeyword_0; }

		//INT+
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }

		//modelFeatures=ModelFeatures
		public Assignment getModelFeaturesAssignment_2() { return cModelFeaturesAssignment_2; }

		//ModelFeatures
		public RuleCall getModelFeaturesModelFeaturesParserRuleCall_2_0() { return cModelFeaturesModelFeaturesParserRuleCall_2_0; }
	}

	public class ModelFeaturesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ModelFeatures");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFeatureKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cDataTypeRuleParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ModelFeatures:
		//	"feature" name=ID DataTypeRule ";";
		public ParserRule getRule() { return rule; }

		//"feature" name=ID DataTypeRule ";"
		public Group getGroup() { return cGroup; }

		//"feature"
		public Keyword getFeatureKeyword_0() { return cFeatureKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//DataTypeRule
		public RuleCall getDataTypeRuleParserRuleCall_2() { return cDataTypeRuleParserRuleCall_2; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class DataTypeRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DataTypeRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cKeywordKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cSTRINGTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//DataTypeRule:
		//	INT "keyword" INT STRING?;
		public ParserRule getRule() { return rule; }

		//INT "keyword" INT STRING?
		public Group getGroup() { return cGroup; }

		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }

		//"keyword"
		public Keyword getKeywordKeyword_1() { return cKeywordKeyword_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }

		//STRING?
		public RuleCall getSTRINGTerminalRuleCall_3() { return cSTRINGTerminalRuleCall_3; }
	}
	
	
	private ModelElements pModel;
	private ModelFeaturesElements pModelFeatures;
	private DataTypeRuleElements pDataTypeRule;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public UnassignedRuleCallTestLanguageGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.xtext.ecoreInference.UnassignedRuleCallTestLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	"model" INT+ modelFeatures=ModelFeatures;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//ModelFeatures:
	//	"feature" name=ID DataTypeRule ";";
	public ModelFeaturesElements getModelFeaturesAccess() {
		return (pModelFeatures != null) ? pModelFeatures : (pModelFeatures = new ModelFeaturesElements());
	}
	
	public ParserRule getModelFeaturesRule() {
		return getModelFeaturesAccess().getRule();
	}

	//DataTypeRule:
	//	INT "keyword" INT STRING?;
	public DataTypeRuleElements getDataTypeRuleAccess() {
		return (pDataTypeRule != null) ? pDataTypeRule : (pDataTypeRule = new DataTypeRuleElements());
	}
	
	public ParserRule getDataTypeRuleRule() {
		return getDataTypeRuleAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
