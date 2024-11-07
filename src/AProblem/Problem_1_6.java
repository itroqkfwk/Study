package AProblem;

import java.util.Scanner;

public class Problem_1_6 {

	public static void main(String[] args) {
		
		//9번
		Scanner scan = new Scanner(System.in);
		System.out.println("1.정수을 입력하세요");
		int n = scan.nextInt();
				
		System.out.println("2.정수를 입력하세요");
		int s = scan.nextInt();
		int result = (n>s)?n:s;

		System.out.println("정수 " + n +", 과 " + s + " 의 최대값: " + result );
				
		scan.close();  // 


		
	}

}
