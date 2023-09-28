package AllJava8Featuress;

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new Demo();
		obj.name();
		
		Demo.Demo2 obj1 = obj.new Demo2();
		obj1.data();
		
		//Agar Demo2 Static ho to (new Demo.Demo2()); Chlega...

	}

	private static void Demo2() {
		// TODO Auto-generated method stub
		
	}

}
class Demo {
	int a;
	public  void name() {
		System.out.println("Piyush Here");
	}

class Demo2{
	public void data() {
		System.out.println("All good");
	}
	
}
}