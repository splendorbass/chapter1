package chapter01;

public class VariableTest {

	public static void main(String[] args) {
		byte b = 10;
		int i=10;
		long l =90;
		float f = 3.14f;
		double d = 3.14;
		char c = 'a';
		boolean bool = true;
		String str= "Hello world";
		
		System.out.println(b);
		System.out.println(l);
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bool);
		System.out.println(str);
		System.out.println(c);
		
		// reference type(ÂüÁ¶Çü)
		Circle1 circle = new Circle1();

		System.out.println(circle.radius);
		
		String s = new String("Hello World");
		System.out.println(s);
		
		//character type
		char ch1 = '1';
		char ch2 = 49;
		char ch3  = 43;
		System.out.println(ch1+":"+ch2+":"+ch3);
		}

}
