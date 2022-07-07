
public class MethodsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//why method (in case lines of codes are to be reused then you can create a method and 
		//wrap all those lines of code inside the method
		
		MethodsJava m = new MethodsJava();
		String name = m.getData();
		System.out.println(name);
		
		MethodsJava2 j = new MethodsJava2();
		j.getuserData();
		
		getData2();
	}

	//Any method to be written only outside main block 
	public  String getData()
	{
		System.out.println("Hello world");
		return "Sindhu";
	}
	public  static String getData2()
	{
		System.out.println("Hello world");
		return "Sindhu";
	}
}
