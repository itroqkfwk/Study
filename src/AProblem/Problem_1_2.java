package AProblem;

public class Problem_1_2 {

	public static void main(String[] args) {
		
		//문제 6번까지
		//1번
		String s1 = "1";
		String s2 = "2";
		boolean bnx = false;
		char c1 = 'A';
		char c2 = 'B';
		char c3 = '1';
		char c4 = '2';
		int inx = 2;
		
		System.out.println("1" + "2" );
		System.out.println(!bnx );
		System.out.println('A'+'B' );
		System.out.println('1'+2);
		System.out.println('1' + '2' );

		//문제2번
		int num = 456;
		int result = num / 100 * 100;
		System.out.println(result);
		
		//문제3번
		char ch = 'z';
		boolean b = ('a' <=ch && ch <= 'z')||('A' <= ch && ch <= 'Z');
		System.out.println(b);
		
		//문제4번
		int fahrenheit = 100;
		float celcius = 5f / 9 * (fahrenheit - 32);
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
	

		
	}

}
