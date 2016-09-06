package chapter01;

public class TypeCast {

	public static void main(String[] args) {
		//암시적 변환
		int i = 10;
		long l = i;
		System.out.println(i + ":" + l);
		
		//명시적 변환
		long l2 = 123456789;
		int i2 = (int) l2;
		System.out.println(i2 + ":" + l2);

	}

}
