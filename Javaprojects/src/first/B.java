package first;

public class B extends A{
	
	int a;
	B(){
		a=30;
		//System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B obj=new B();

obj.display();

	}
void display() {
	int a=20;
	System.out.println(a);
	System.out.println(this.a);
	//System.out.println(super.a);
}

}
