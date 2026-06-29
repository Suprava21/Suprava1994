package TestNGFramework;

public class PS2 extends PS3{
	int a;  //class variable
	
	public PS2(int a) { //instance variable
		super(a);     //super keyword will always be written in the first line of the constructor
		this.a=a;        //this keyword can be used to call the current class variable. assigning the instance variable with the class variable.
	}

	public int increment() {
		 a=a+1;
		 return a;
		
	}
	
	public int decrement() {
		a=a-1;
		return a;
	}

}
