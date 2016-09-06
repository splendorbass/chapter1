package chapter01;

public class Arith2 {

	public static void main(String[] args) {
		int a = 7; 
		int b = 3;

		System.out.println(a==b);  // True or False?
		System.out.println(a!=b); // True or False?
		System.out.println(a<b); // True or False?
		System.out.println(a>b); // True or False?
		System.out.println((a>b)&&(a<b)); // True or False?
		System.out.println((a>b)||(a<b)); // True or False?

		boolean x = 7 == 9; // x값은 True or False?
		x = 9.5 >= 9.5; // x값은 True or False?
		x = 8 != 9 - 1; // x값은 True or False?
		x = false == (10 == 0); // x값은 True or False?
		System.out.println(x);
		
		System.out.println(a*(++b));
	}

}
