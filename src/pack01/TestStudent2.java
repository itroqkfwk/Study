package pack01;

public class TestStudent2 {

	public static void main(String[] args) {
		
		// 배열
	    // 데이터형 [] 변수명;
		Student [] stu = new Student[3];
		stu[0]= new Student("Kim", 100, 90, 95, 89);
		stu[1]= new Student("Lee", 60, 70, 99, 98);
		stu[2]= new Student("Park", 68, 86, 60, 40);
		for (Student s : stu) {
			System.out.printf("%s  평균:%.2f 학점:%s \n",s.getName(), s.getAvg(), s.getGrade());
		}
		// 리터럴 방법
		Student [] stu2 = {new Student("Kim", 100, 90, 95, 89),
				           new Student("Lee", 60, 70, 99, 98),
				           new Student("Park", 68, 86, 60, 40)
		                  };
		for (Student s : stu2) {
			System.out.printf("%s  평균:%.2f 학점:%s \n",s.getName(), s.getAvg(), s.getGrade());
		}
		// new + 리터럴
		Student [] stu3= new Student[] {new Student("Kim", 100, 90, 95, 89),
		           new Student("Lee", 60, 70, 99, 98),
		           new Student("Park", 68, 86, 60, 40)
               };
	}
}
