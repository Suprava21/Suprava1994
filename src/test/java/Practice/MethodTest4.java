package Practice;

public class MethodTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodTest4 d= new MethodTest4();
		String result = d.GetData();
		System.out.println(result);
		//creating object of another class and calling its method
		MethodDemo1 d1=new MethodDemo1();
		d1.GetUserData();
		GetnameData();

	}
	//Why Method - repeatable use of piece of code. So method is created.
	public String GetData()
	{
		System.out.println("Hello World");
		return "Suprava Panigrahi";
	}
	//Static will move the method to Class level and this method can be used without creating a object.
	public static void GetnameData()
	{
		System.out.println("Automation Lead");
		
	}

}
