package com.nihilent.static_keyword;

public class StaticVariables {

	// Example to show , static variables are shared among the Objects (Even if u
	// create multiple objects.finally
	// which u have declared then that value ,should overwrite the existing and this
	// only show)//

	static int accountbalance = 0;
	String depositedby;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariables object1 = new StaticVariables();
		object1.accountbalance = 2000;
		object1.depositedby = "Kareena";

		StaticVariables object2 = new StaticVariables();
		object2.accountbalance = 3000;
		object2.depositedby = "Preethi";

		System.out.println("Object1 Integer is " + object1.accountbalance);
		System.out.println("Object1 String is " + object1.depositedby);
		System.out.println("Object2 Integer is " + object2.accountbalance);
		System.out.println("Object2 String is " + object2.depositedby);

	}

}

// Whenever we declare keyword as Static then at that moment itself it is common to all Instances(or Objects)
//Only a Single copy of static variable is created and shared among all the Instances.
