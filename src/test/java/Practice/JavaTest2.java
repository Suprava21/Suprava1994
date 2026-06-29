package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,22,23,21,25,2,4,3,5};
		//check if the array has any multiple of 2 no
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i] % 2 == 0)
			{
				System.out.println(arr1[i]);
				break;
			}
			else
			{
				System.out.println(arr1[i] + " Is not a multiple of 2");
			}
		}
       //For dynamically growing data set where we dont have the knowledge on the number of items, normal array cant be used.
		ArrayList<String> a= new ArrayList<String>();
		a.add("Suprava");
		a.add("Panigrahi");
		a.add("Parida");
		System.out.println(a.get(2));
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		for(String val : a)
		{
			System.out.println(val);
		}
		//item present in Arraylist
		System.out.println(a.contains("Suprava"));
		String[] names ={"Suprava","Panigrahi","Parida"};
		List<String> nameArrayList= Arrays.asList(names);
		System.out.println(nameArrayList.contains("Parida"));			

	}

}
