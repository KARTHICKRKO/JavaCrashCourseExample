package caom.nihilent.stringconcepts;

public class Stringbufferexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("String is Immutable");
		String name = "Haritha";
		System.out.println("Appending to a Original name : " + name.concat("Karthick"));
		System.out.println("Original name is :" + name);

		System.out.println("***************************************");

		System.out.println("String Buffer is mutable");
		StringBuffer name1 = new StringBuffer("Haritha");
		System.out.println("Appending to a Original name : " + name1.append("Arya"));
		System.out.println("Original name is :" + name1);
		
		//String Buffer methods
		
		//1. Reverse
		
		System.out.println("Reversed name is : " + name1.reverse());

		//2. Replace
		StringBuffer name2 = new StringBuffer("Haritha");
		System.out.println("Replaced name is : " + name2.replace(0, 5, "Kaviya"));
		
		//3.Insert
		System.out.println("Inserted name is :" + name2.insert(8, "Erumai"));
		
		//4.Delete
		System.out.println("Deleted name is :" + name2.delete(0, 8));
	}

}
