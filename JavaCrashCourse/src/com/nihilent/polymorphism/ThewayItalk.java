package com.nihilent.polymorphism;

public class ThewayItalk {

	public void talk(Parentsexample talk) {

		System.out.println("Respectful and polite talking");
	}

	public void talk(Partnerexample talk) {
		System.out.println("Love and Care");
	}

	public void talk(Bossexample talk) {
		System.out.println("Nothing Personal");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThewayItalk talk = new ThewayItalk();
		Parentsexample parents = new Parentsexample();
		talk.talk(parents);

		Bossexample boss = new Bossexample();
		talk.talk(boss);

		Partnerexample partner = new Partnerexample();
		talk.talk(partner);
	}

}
