package AProblem;

public class Problem_1_1 {

	public static void main(String[] args) {
		
		//문제1
		String name = "홍길동";
		int age = 20;
		String home = "서울";
		
		System.out.println("이름은 " + name + "\n" + "나이는 " + age + " 이고 주소는 " + home);
		System.out.print("이름은 " + name + "\n" + "나이는 " + age + " 이고 주소는 " + home);
		System.out.printf("\n이름은 %s\n나이는 %d 이고 주소는 %s", name, age, home);
		
		
		//문제2
		long me = 8310202182637L;
		System.out.println();
		System.out.println("나의 주민번호: "+ me);
		
		//문제3
		int n = 10;
		int n2 = 20;
		
		int temp = n;
		n = n2;
		n2 = temp;
		
		 //값 변경 코드 구현
		System.out.println("n값은 " + n);
		System.out.println("n2값은 " + n2);

		
	}

}
