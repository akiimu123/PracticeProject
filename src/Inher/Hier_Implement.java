package Inher;

public class Hier_Implement {

	public static void main(String[] args) {
		 Hier_c1 a=new  Hier_c1();
		 a.bike();
		 a.car();
		 a.home();
		 System.out.println("*****************");
		 Hier_2 b=new  Hier_2();
		 b.car();
		 b.mobile();
		 b.home();;
		 System.out.println("*****************");
		 Hier_3 c=new  Hier_3();
		 c.laptop();
		 c.home();
		 c.car();
	}

}
