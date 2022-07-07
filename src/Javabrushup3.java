
public class Javabrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is an object //String literal
		//here same value it refers to one string only
String s = "Prem Sindhu";
String s1 = "Guru Swaroop";

//New memory allocator (same value but still creates space in the memory)

String s2 = new String("Wel hello come");

String[] splittedString = s2.split ("hello");

System.out.println(splittedString[0]);
System.out.println(splittedString[1]);
System.out.println(splittedString[1].trim());


for(int i = s.length() - 1; i>=0; i--)
{
	System.out.println(s.charAt(i));
}

for(int i = 0; i<s1.length(); i++)
{
	System.out.println(s1.charAt(i));
}
	}

}
