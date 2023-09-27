package com.nihilent.javalearning;

public class CollectAmount {
	
	public Integer collectedamount=1000;
	public Integer collectamountandgiveittome() {
		System.out.println("Daddy I have collected the amount " +collectedamount+ " and I have sent it to you");
		return collectedamount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollectAmount myson= new CollectAmount();
		Integer returnamount=myson.collectamountandgiveittome();
		System.out.println("Got the amount son " +returnamount);

	}

}
