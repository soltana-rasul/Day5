class test{
	public void add (int num1, int num2) throws ArithmeticException{
		System.out.println(num1+num2);
	}
	public void v1 (int num1, int num2) throws Exception {
		add(num1,num2);
	}
	public void v2(int num1, int num2) {
		try {
			v1(num1,num2);
		}catch (Exception e) {
			System.out.println("Exception Fixed");
		}
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test obj = new test();
		obj.v2(6, 10);
	}

}
