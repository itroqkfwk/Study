package pack01;

public class TestStudent {

	public static void main(String[] args) {
		
		//일반 변수
		Student s1 = new Student("Kim", 100, 90, 95, 89);
		Student s2 = new Student("Lee", 60, 70, 99, 98);
		Student s3 = new Student("Park", 68, 86, 60, 40);
		
		System.out.printf("%s  평균:%.2f 학점:%s \n",
				          s1.getName(), s1.getAvg(), s1.getGrade()
				          );
		System.out.printf("%s  평균:%.2f 학점:%s \n",
		          s2.getName(), s2.getAvg(), s2.getGrade()
		          );
		
		System.out.printf("%s  평균:%.2f 학점:%s \n",
		          s3.getName(), s3.getAvg(), s3.getGrade()
		          );
		
		
	}
}
