package chapter01;

import java.util.Scanner;

public class NHelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		
		for(int i = 0; i < count; i++){
			System.out.println("Helloworld");
		}

	}

}
