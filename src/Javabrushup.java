
public class Javabrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Data types and variables

int num = 5;
String website = "OIPA";
char letter = 'P';
double dec = 5.99;
boolean mycard = true;

System.out.println(num + " is the value stored in the num variable");
System.out.println(website);
System.out.println(letter);
System.out.println(dec);
System.out.println(mycard);

//Arrays

int[] arr = new int[5];
arr[0] = 1;
arr[1] = 2;
arr[2] = 3;
arr[3] = 4;
arr[4] = 5;

int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

System.out.println(arr2[5]);

//for loop

for (int i=0; i<arr.length; i++)
{
	System.out.println(arr[i]);
}
for (int i = 0; i<arr2.length; i++)
	{
	System.out.println(arr2[i]);
	}

String[] name = {"Prem","Sindhu","hello"};

//for (int i=0; i<name.length; i++)
//{
//	System.out.println(name[i]);
//}
	//Enhanced forloop
for (String s : name)
{
	System.out.println(s);
}
}
}

