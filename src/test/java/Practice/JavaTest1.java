package Practice;

public class JavaTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		String name = "Suprava";
		boolean status = true;
		double no = 8.99;
		char letter ='r';
		
		System.out.println(num + " is my lucky number" );
		
		int[] arr= new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=5;
		arr[3]=7;
		
		int[] arr1= {1,2,3,22,23,21,25,2,4,3,5};
		System.out.println(arr1[1] + ":"+ arr[0]);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]);
		}
		System.out.println(" ");
		
		String[] names ={"Suprava","Panigrahi","Parida"};
		
		for(int i=0;i<names.length;i++)
		{
			System.out.print(names[i]);
		}
		for(String s:names)
		{
			System.out.println(s);
		}
		
		
	}

}
