package DemoProgram;

public class Prog2_1 {
	
  	public static void see()     //1--static in same class
	{
		System.out.println("see the reallity");
	}
	public static void info()      //2---static method in diff class
	{
		System.out.println("hannah is a good singer");
	}
	public static void add(int a,int b,int c) {     //static with parameter in same class
		int z=a+b+c;
		System.out.println("addition of three number="+z);
	}
	public static void info(String name,double sal,int age) {   //static with parameter in diff class
		System.out.println("name of student="+(name));
		System.out.println("age="+age);
		System.out.println("sal="+sal);
	}
	public static String showcase()  // /return type from same class
	{    
		return "name";
	}
	public static int mul()      //return type from diff class
	{
		return 20*10;
	}
	
	
	
	

	public static void main(String[] args) {
      see();
      add(10,12,14);
      String a= showcase();
    
      
      System.out.println(a);
      
      
	}

}
