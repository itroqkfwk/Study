package exam01_데이터종류;

public class PDT01_정수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 10진수 데이터 표현
		System.out.println(100);
		System.out.println(-100);
		System.out.println(0);
		
		//2. 2진수 데이터 표현 ( 0|1이용, 0b 표현)
		System.out.println(0b01);  // 1
		System.out.println(0b10);  // 2
		System.out.println(0b11);  // 3
		System.out.println(0b100); // 4
		
		//3. 8진수 데이터 표현 ( 0~7 이용, 0 표현)
		System.out.println(01);  // 1
		System.out.println(02);  // 2
		System.out.println(03);  // 3
		System.out.println(04);  // 4
		System.out.println(05);  // 5
		System.out.println(06);  // 6
		System.out.println(07);  // 7
		System.out.println("###########################");
		
		//3. 8진수 데이터 표현 ( 0~9 이용, A, B, C, D, E, F 이용 , 0x 표현)
		System.out.println(0x1);  // 1
		System.out.println(0x2);  // 2
		System.out.println(0x9);  // 9
		System.out.println(0xA);  // 10
		System.out.println(0xB);  // 11
		System.out.println(0xC);  // 12
		System.out.println(0xD);  // 13
		System.out.println(0xE);  // 14
		System.out.println(0xF);  // 15
		
		//long타입으로 지정하는 방법
		System.out.println(100L); // 100L은 정수형 long 타입으로 처리됨.
		
	}

}
