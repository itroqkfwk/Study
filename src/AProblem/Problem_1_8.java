package AProblem;

import java.util.Scanner;

public class Problem_1_8 {

	public static void main(String[] args) {
		
		//10번
		Scanner scan = new Scanner(System.in);
		System.out.println("1.정수을 입력하세요");
		int n = scan.nextInt();
				
		System.out.println("2.정수를 입력하세요");
		int s = scan.nextInt();
		
		System.out.println("3.정수를 입력하세요");
		int d = scan.nextInt();
		
		int result = (n>s)?(n>d?n:d):(s>d?s:d);

		System.out.println("정수 " + n +", 과 정수 " + s + ", 정수 " + d + " 중에서 최대값: " + result );
				
		scan.close();  // 


		
	}

}
