import aima.core.environment.cellworld.Cell;
import aima.core.probability.FiniteProbabilityModel;
import aima.core.probability.bayes.approx.BayesInferenceApproxAdapter;
import aima.core.probability.bayes.approx.GibbsAsk;
import aima.core.probability.bayes.approx.LikelihoodWeighting;
import aima.core.probability.bayes.model.FiniteBayesModel;
import aima.core.probability.example.BayesNetExampleFactory;
import aima.core.probability.example.ExampleRV;
import aima.core.probability.proposition.AssignmentProposition;
public class Projeto {

	public static final int NUM_SAMPLES = 1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bayesLikelihoodWeightingDemo();
		System.out.println("\n");
		bayesGibbsAskDemo(); 

	}
	
	
	public static void bayesLikelihoodWeightingDemo() {
		System.out.println("DEMO: Bayes Likelihood Weighting N = "
				+ NUM_SAMPLES);
//****************************************************************************		
		ProblemaABCDModel(new FiniteBayesModel(
				BayesNetExampleFactory.constructpProblemaANetwork(),
				new BayesInferenceApproxAdapter(new LikelihoodWeighting(),
						NUM_SAMPLES)));
//***************************************************************************	
}
	
	public static void bayesGibbsAskDemo() {
		System.out.println("DEMO: Bayes Gibbs Ask N = " + NUM_SAMPLES);
		System.out.println("=====================");
		ProblemaABCDModel(new FiniteBayesModel(
				BayesNetExampleFactory.constructpProblemaANetwork(),
				new BayesInferenceApproxAdapter(new GibbsAsk(), NUM_SAMPLES)));
		System.out.println("=====================");
	}
	
	
	private static void ProblemaABCDModel(FiniteProbabilityModel model) {
		
		System.out.println("--------PROBLEMA A---------");
		System.out.println("A B C D");
		System.out.println("----------------------------");
		
		AssignmentProposition a1 = new AssignmentProposition(ExampleRV.A_RV, 0.3);
		AssignmentProposition a2 = new AssignmentProposition(ExampleRV.A_RV, 0.6);
		AssignmentProposition a3 = new AssignmentProposition(ExampleRV.A_RV, 0.1);
		AssignmentProposition b1 = new AssignmentProposition(ExampleRV.B_RV, Boolean.TRUE); //AMERICAN
		AssignmentProposition b2 = new AssignmentProposition(ExampleRV.B_RV, Boolean.FALSE); //NON-AMERICAN
		AssignmentProposition c1 = new AssignmentProposition(ExampleRV.C_RV,Boolean.TRUE );
		AssignmentProposition d1 = new AssignmentProposition(ExampleRV.D_RV,0.7);
		AssignmentProposition d2 = new AssignmentProposition(ExampleRV.D_RV,0.2);
		AssignmentProposition d3 = new AssignmentProposition(ExampleRV.D_RV,0.1);
		
		
			
			System.out
			.println("P<>(b2 | a1=0.3, c1=true, d1 =0.7) = "
					+ model.posteriorDistribution(ExampleRV.B_RV,a1,c1,d1)); //(a)
			
			System.out
			.println("P<>(c1 | a2=0.6, b1=true, d2 =0.2) = "
					+ model.posteriorDistribution(ExampleRV.C_RV,a2,b1,d2)); //(b)
			
			System.out
			.println("P<>(c1 | a3=0.1, d3 =0.1) = "
					+ model.posteriorDistribution(ExampleRV.C_RV,a3,d3)); //(c)

	
	}
	
	//***********************************************************************************************

}
