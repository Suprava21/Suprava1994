package Practice;

public class JavaTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is an object which represents sequence of characters. 
		//String Literal - If both the Strings will have same values then memory wont be created for s2.
		String s1="Sups rosy chintu";
		String s2="Sups";
		
		//new object memeory locator = Every time new objects will be created as we are using New keyword evenif the same text present in both the strings..
		String s= new String("Super");
		String s3= new String("Super");
		String[] splittedString = s1.split("rosy");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		//System.out.println(splittedString[2]);
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.println(s1.charAt(i));
		}
		
		
		

	}

}
