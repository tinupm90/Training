package first;

public class Rectangle extends Shape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r=new Rectangle();
		r.area();

	}
	void area() {
		int l=10;
		int b=20;
		int a=l*b;
		System.out.println("Area of rectangle="+a);
		
	}

}
