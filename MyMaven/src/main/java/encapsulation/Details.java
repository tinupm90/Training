package encapsulation;

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		s.setS("Anu");
		s.setA(23);
		
		System.out.println("Student Name:"+s.getS());
		System.out.println("Student age:"+s.getA());
	}

}
