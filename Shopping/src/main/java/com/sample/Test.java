package com.sample;

import java.util.Scanner;


import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// TODO Auto-generated method stub

			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");

	    	Customer c=new Customer("Deepa","Euro");
	    	Order o=new Order("123456","Electronic Goods",100000,"Processed");
	    	Response r=new Response();

	        FactHandle fact1;
	    	fact1 = kSession.insert(c);
			fact1 = kSession.insert(o);
			fact1 = kSession.insert(r);
			
			//kSession.retract(fact1);
		
			kSession.fireAllRules();

			System.out.println("The response for the customer "+c.getName()+" and the stock name is "+o.getStock()+" and the ordered amount is "+o.getAmount()+" and the currency type is of "+c.getCurrency());

	    }

		catch (Throwable t) {
			t.printStackTrace();

	    }
	}

}
