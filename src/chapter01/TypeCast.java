package chapter01;

public class TypeCast {

	public static void main(String[] args) {
		//�Ͻ��� ��ȯ
		int i = 10;
		long l = i;
		System.out.println(i + ":" + l);
		
		//����� ��ȯ
		long l2 = 123456789;
		int i2 = (int) l2;
		System.out.println(i2 + ":" + l2);

	}

}
