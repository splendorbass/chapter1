package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�Ҽ����� �Ǵ��� ����: ");
		int num = scanner.nextInt();
		
		int divisor = 2;
		boolean isPrime = true;
		
		while(divisor < num){
			if( num % divisor == 0){
				isPrime = false;
				break;
			}
			divisor++;
		}
		if(isPrime){
			System.out.println(num+"�� �Ҽ��Դϴ�.");
		}else{
			System.out.println(num+"�� �Ҽ��� �ƴմϴ�.");
		}
		
		
		

	}

}
