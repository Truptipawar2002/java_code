package Polymorphism;

public class overloadingDemo {

	public static void main(String[] args) {
		
		System.out.println("-------------Method overloading-----------");
		
		System.out.println("Addition of two integer : "+Methodoverloading.addition(30, 50));
		System.out.println("Addition of two floating number : "+Methodoverloading.addition(6.5f, 8.0f));
		System.out.println("Addition of one interger and one float : "+Methodoverloading.addition(5, 4.5f));
		System.out.println("Addition of one float and one interger : "+Methodoverloading.additon(5.4f, 60));
		
		System.out.println("-------constructor overloading--------");
		
		point p=new point();  //default constructor invoked
		System.out.println(p);
		
		point p1=new point(14.3f);  //single parameter constructor
		System.out.println(p1);
		
		point p2=new point(11.3f, 12.4f);
		System.out.println(p2);
		

	}

}
