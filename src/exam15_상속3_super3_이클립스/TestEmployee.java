package exam15_상속3_super3_이클립스;

public class TestEmployee {

	public static void main(String[] args) {
		
		Manager m = new Manager("홍길동", 4000, "개발");
		Engineer eng = new Engineer("유관순", 2500, "자바");
		System.out.println(m.getEmployee());
		System.out.println(m.getName()+"\t"+m.getSalary()+"\t"+m.getDepart());
		System.out.println(eng.getEmployee());
		System.out.println(eng.getName()+"\t"+eng.getSalary()+"\t"+eng.getSkill());

	}

}
