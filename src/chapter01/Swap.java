package chapter01;

public class Swap {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;
		int n3 = 0;

		// Q1: n1���� �׻� ū ���� �ǵ���, �ʿ��� ��� n1�� n2�� ��ü�϶�.
		if(n1<n2){
			n3 = n1;
			n1 = n2;
			n2 = n3;
		}
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);

		// Q2: �ִ밪�� �Ǻ��ϴ� ������ �ϼ��� ������.
		int a1 = 20;
		int a2 = 20;
		int a3 = 20;

		if (a1 > a2) {
			if(a1 > a3){
				System.out.println("���밪�� a1:"+a1);
			}else if(a1 == a3){
				System.out.println("���밪�� a1,a3:"+a1);
			}
			
		} else if(a2 > a3){
			if(a2 > a1){
				System.out.println("���밪�� a2:"+a2);
			}else if(a2 == a1){
				System.out.println("���밪�� a1,a2:"+a1);
			}
		} else if(a3 > a1){ 
			if(a3 > a2){
				System.out.println("�ִ밪�� a3:"+a3);
			}else if(a3 == a2){
				System.out.println("�ִ밪�� a2,a3:"+a3);
			}
		} else{
			System.out.println("a1,a2,a3 ��� ���� ��:"+a3+"�Դϴ�.");
		}

	}

}
