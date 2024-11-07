package AProblem;

import java.util.Scanner;

public class Problem_1_4 {

	public static void main(String[] args) {
		
		//7번
		Scanner scan = new Scanner(System.in);
		System.out.println("1.이름을 입력하세요");
		String n = scan.next();
		
		System.out.println("2.나이를 입력하세요");
		int s = scan.nextInt();

		System.out.println("이름은: " + n +", 나이는 " + s + " 입니다.");
		
		scan.close();  // 
		
	}

}
