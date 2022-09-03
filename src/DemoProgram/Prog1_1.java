package DemoProgram;

public class Prog1_1 {

	public static void main(String[] args) {

		Prog1.show();
		Prog1.add(10,20);
		int k=Prog1.mul();
		System.out.println("mul="+k);
		
		System.out.println("");
		int j=Prog1.sum(5,6);
		System.out.println(j);
		
		Prog1 l=new Prog1();
		l.display();
		l.info("akii");
		
		System.out.println("multiplication="+(l.mul1()));
		
		System.out.println("division="+(l.div1(50, 10)));
		
		
		
		
	}

}
