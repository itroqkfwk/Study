package exam22_람다표현식;

@FunctionalInterface // 반드시 단 하나의 추상메서드를 가지도록 강제함.
interface Flyer2{
	//파라미터있고 리턴 없는 형식
	public abstract void fly(int n);
}

@FunctionalInterface // 반드시 단 하나의 추상메서드를 가지도록 강제함.
interface Flyer3{
	//파라미터있고 리턴 없는 형식
	public abstract void fly(int n, String n2);
}

public class Testmain2 {

	public static void main(String[] args) {
		
		//파라미터가 한개인 경우
		//익명클래스
		Flyer2 f = new Flyer2() {
			@Override
			public void fly(int n) {
				System.out.println("익명클래스 fly()" + n);
			}
		};
		f.fly(100);
		
		//람다 표현식
		Flyer2 f2 = (int n)->{System.out.println("람다 표현식 fly()" + n);};
		f2.fly(200);
		
		//파라미터변수의 타입 생략 가능
		Flyer2 f3 = (n)->{System.out.println("람다 표현식 fly()" + n);};
		f3.fly(300);
		
		//파라미터가 한개인 경우에는 () 생략가능. 먄약 2개 이상이면 생략 불가
		Flyer2 f4 = n->System.out.println("람다 표현식 fly()" + n);
		f4.fly(400);
		
		//파라미터가 두개 이상인 경우
		//익명 클래스
		Flyer3 x = new Flyer3() {
			@Override
			public void fly(int n, String n2) {
				System.out.println("익명클래스 fly()" + n + "\t" + n2);
			}
		};
		x.fly(10,"홍길동");
		
		//람다표현식
		Flyer3 x2 = (int n, String n2) -> {System.out.println("익명클래스 fly()" + n + "\t" + n2);};
		x.fly(20, "홍길동");
		
		//파라미터변수의 타입 생략 가능
		Flyer3 x3 = (n, n2) -> {System.out.println("익명클래스 fly()" + n + "\t" + n2);};
		x.fly(30, "홍길동");
		
		
	}//end main

}//end class
