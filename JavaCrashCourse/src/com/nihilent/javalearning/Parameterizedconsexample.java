package com.nihilent.javalearning;

public class Parameterizedconsexample {
	
	String animal_name;
	String animal_type;
	
	//giving some parameters inside the constructor
	Parameterizedconsexample(String name,String type){
		animal_name=name;
		animal_type=type;
	}
	public void sayaboutanimal() {
		System.out.println("Animal name is "+animal_name+ " Animal type is " +animal_type);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parameterizedconsexample para=new Parameterizedconsexample("Tiger", "Omnivores");
		para.sayaboutanimal();
		
		Parameterizedconsexample para1=new Parameterizedconsexample("Onai", "Omnivores");
		para1.sayaboutanimal();
		

	}

}
