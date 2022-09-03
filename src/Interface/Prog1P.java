package Interface;

import java.util.Scanner;

public class Prog1P implements  Prog1_p {
     int num1, num2;
     
	@Override
	public void operation() {
       Scanner a=new Scanner (System.in);
        System.out.println("inter the integer value of num1 and num2");
        num1=a.nextInt();
        num2=a.nextInt();
	}

	@Override
	public void show() {
          System.out.println("Addition of two no.="+(num1+num2));		
	}

	@Override
	public void sub() {
		//sub=num1-num2;
		System.out.println("subtraction of two number");
	}

	@Override
	public void display() {
            System.out.println("subtraction="+(num1-num2));		
	}
     
}
