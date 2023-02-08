package oops;

public class Operators {

	void operation(int a, int b) {
		System.out.println(a - b);
	}

	int operation(int a, int b, int c) {
		return a + b + c;
	}
	
	static void add(int x, int y)
	{
		System.out.println(x+y);
	}

	void operation(double a, int b, int c) {
		System.out.println(a * b * c);
	}

	static int operation(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operators operators = new Operators();
		operators.operation(5, 2);
		System.out.println(operators.operation(2, 3, 1));
		operators.operation(10.5, 5, 5);
		System.out.println(operation(2, 2, 2, 2));
		System.out.println(Operators.operation(1, 1, 1, 1));
		add(10, 20);
	}

}
