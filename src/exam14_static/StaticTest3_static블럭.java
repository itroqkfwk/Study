package exam14_static;
	
public class StaticTest3_static블럭 {
	
	// static 블럭: 프로그램 실행할 때 실행
	static {
		System.out.println("static 블럭");
	}
	
	//instance 블럭: new 할때 실행
	{
		System.out.println("instance 블럭");
	}
	public static void main(String[] args) {
		
		StaticTest3_static블럭 t = new StaticTest3_static블럭();

	}

}
