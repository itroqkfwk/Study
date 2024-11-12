package exam13_method5_return;

public class MainTest {

	
		public static void  method() {
			System.out.println("A");
			if(true)return;
			System.out.println("B");
			System.out.println("C");

		}
			
		public static void  main(String[] args) {
			System.out.println("프로그램 시작");
			
			method();
			
			System.out.println("프로그램 종료");

	}

}
