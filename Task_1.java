import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int var1;
        int var2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter variables");
        var1=sc.nextInt();
        var2=sc.nextInt();
        boolean greaterThan=var1>var2;
        System.out.println("greater variable ->" + greaterThan);
        boolean lessThan=var1<var2;
        System.out.println("lesser variable ->" +lessThan);
        boolean greaterThanOrEq=var1>=var2;
        System.out.println("greater variable or equal ->" + greaterThanOrEq);
        boolean lessThanOrEq=var1<=var2;
        System.out.println( " lesser than or equal variable ->" +lessThanOrEq);
        boolean equal=var1==var2;
        System.out.println("Equal variable ->" +equal);
        boolean notEqual=var1!=var2;
        System.out.println("not equal variable ->" + notEqual);
	}

}
