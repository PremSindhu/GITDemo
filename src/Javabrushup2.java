import java.util.ArrayList;

public class Javabrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		// only multiples of 2 -> 2,4,6,8,10,12,14
		//check if array has any value which is multiple of 2 
		
		for (int i=0; i<arr2.length; i++)
		{
			if (arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				break;
			}
			else
			{
				System.out.println(arr2[i] + " is not multiple of 2");
			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		//create object of the class to access methods of a class- object.method 
		a.add("Sindhu");
		a.add("Prem");
		a.add("OIPA");
		
		System.out.println(a.get(1));
	}

}
