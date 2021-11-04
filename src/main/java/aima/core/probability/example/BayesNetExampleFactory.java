package aima.core.probability.example;

import aima.core.probability.bayes.BayesianNetwork;
import aima.core.probability.bayes.FiniteNode;
import aima.core.probability.bayes.impl.BayesNet;
import aima.core.probability.bayes.impl.FullCPTNode;
import aima.core.probability.domain.BooleanDomain;

/**
 * 
 * @author Ciaran O'Reilly
 *
 */
public class BayesNetExampleFactory {
	
	
	//************************************************************************************************
	public static BayesianNetwork constructpProblemaANetwork() {
	
		FiniteNode a = new FullCPTNode(ExampleRV.A_RV, new double[] {
				0.3,
				0.6,
				0.1});
		
		FiniteNode b = new FullCPTNode(ExampleRV.B_RV, new double[] {
				0.2,
				0.8});
		
		FiniteNode c = new FullCPTNode(ExampleRV.C_RV, new double[] {
				0.5,
				0.5,
				0.7,
				0.3,
				0.6,
				0.4,
				0.8,
				0.2,
				0.4,
				0.6,
				0.1,
				0.9 },a,b);
		
		FiniteNode d = new FullCPTNode(ExampleRV.D_RV, new double[] {
				0.7,
				0.2,
				0.1,
				0.5,
				0.3,
				0.2},c);
		
		
		
		return new BayesNet(a,b);
	}
	
	//**************************************************************************************************
}
