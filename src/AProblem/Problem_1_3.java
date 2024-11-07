package AProblem;

public class Problem_1_3 {

	public static void main(String[] args) {
		
		//문제 6번까지
	
		//문제 5번
		byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);
        char ch = 'A';
        ch = (char)(ch + 2);
        float f = 3 / 2f;
        long l = 3000*3000*3000L;
        float f2 = 0.1f;
        double d = 0.1;
        boolean result = (float)d == f2;
        System.out.println("c=" + c);
        System.out.println("ch=" + ch);
        System.out.println("f=" + f);
        System.out.println("l=" + l);
        System.out.println("result=" + result);
        
        //문제6번
        int i = 5;
        String result1 = (i % 2 == 0) ? "짝수입니다" : "홀수입니다";;
        System.out.println("숫자 " + i + "는 " + result1 );


		
	}

}
