package pack01;

public class Student {

	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student() {}

	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	public double getAvg() {
		double sum = korean + english + math + science;
		double avg = sum/4;
//		int sum2 =  korean + english + math + science;
//		double avg2 = sum2/4.0;
		return avg;
	}
	public String getGrade() {
		String grade = null;
		int avg = (int)getAvg();
		if(avg >= 90) {
			grade = "A학점";
		}else if(avg >= 70) {
			grade = "B학점";
		}else if(avg >= 50) {
			grade = "C학점";
		}else if(avg >= 30) {
			grade = "D학점";
		}else {
			grade = "F학점";
		}
		return grade;
	}
    public String getGrade2() {
		
		String grade = "F학점";
		
		int avg = (int)getAvg();
		if(avg >= 90) {
			grade = "A학점";
		}else if(avg >= 70) {
			grade = "B학점";
		}else if(avg >= 50) {
			grade = "C학점";
		}else if(avg >= 30) {
			grade = "D학점";
		}
		return grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}
	
	
	
	
}
