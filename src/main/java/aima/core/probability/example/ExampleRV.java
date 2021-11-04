package aima.core.probability.example;

import aima.core.probability.domain.ArbitraryTokenDomain;
import aima.core.probability.domain.BooleanDomain;
import aima.core.probability.domain.FiniteIntegerDomain;
import aima.core.probability.util.RandVar;
import aima.core.probability.domain.FiniteDomain;

/**
 * Predefined example Random Variables from AIMA3e.
 * 
 * @author Ciaran O'Reilly
 */
public class ExampleRV {
	//
	

	//***************************************************************************
	public static final RandVar A_RV = new RandVar("A",
			new ArbitraryTokenDomain(0.3,0.6,0.1));
	
	public static final RandVar B_RV = new RandVar("B",
			new BooleanDomain());
	
	public static final RandVar C_RV = new RandVar("C",
			new BooleanDomain());
	
	public static final RandVar D_RV = new RandVar("D",
			new ArbitraryTokenDomain(0.7,0.2,0.1));
	
	//****************************************************************************
}
