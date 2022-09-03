package DemoProgram;

import javax.swing.Spring;

public class Prog3_1 {
	public void sub()
	{
		System.out.println("sub="+(10-3));
		
		}
	public void div()
	{
		System.out.println("div="+(10/2));
	}
	public void info(double sal,int age)
	{
		System.out.println("sallary="+sal);
		System.out.println("age of student="+age);
	}
	public void info(int pin,char a)
	{
		System.out.println("pin="+pin);
		System.out.println("grade="+a);
	}
	public int mul1()         //non static return type from same class
	{
		return 10*5;
	}
	public int info()      //non static return type from diff class
	{  
		int grade=10;
		return grade;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prog3_1 f=new Prog3_1();
		f.sub();
		Prog3_1 l=new Prog3_1();
		l.info(50500.3,26);
		l.mul1();
		System.out.println("multiplication="+l.mul1());
		
		
		
		
	}

}
