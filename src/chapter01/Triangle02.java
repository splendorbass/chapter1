package chapter01;

public class Triangle02 {

	public static void main(String[] args) {
		for(int i = 1; i < 6; i++){
			for(int k = 0; k < 5-i; k++ ){
				System.out.print(" ");
			}
			for(int j = 0; j < i+(i-1); j++){
				System.out.print("x");
			}
			System.out.println("");
		}
		for(int a = 0; a < 4; a++){
			for(int b = 0; b < a+1; b++){
				System.out.print(" ");
			}
			for(int c = 0; c < 7-a*2; c++){
				System.out.print("x");
			}
			System.out.println("");
		}
		
	}

}
