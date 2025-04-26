
public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // && || ! -> logical operators
		
		boolean a=true;
		boolean b=false;
		boolean c=true;
		boolean d=true;
		System.out.println(a &&  b); // T + T -> T , T+F -> F ,F+T ->F , F+F ->F
		System.out.println(a || b);    // T+T -> T ,T+F->T , F+T -> T , F+F -> F
		System.out.println(!a);    // T -> F , F -> T
		System.out.println(c && d);
		System.out.println(a || b && c || d); // firstly & operator is checked first and then goes from left to right conditions
		System.out.println(a && b || c && d); // here also it checks the & operator
		
	}

}
