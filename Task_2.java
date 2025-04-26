import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
         int a=20;
         int b=10;
        if(a<b) {
        	System.out.println("B is greater");
        }
        else {
        	System.out.println(" A is greater");
        }
        
       int c=30;
       int d=5;
       if(a>b && a>c && a>d) {
    	   System.out.println("A");
    	   
       }
       else if(b>a && b>c && b>d) {
    	   System.out.println("B");
       }
       else if (c>a && c>b && c>d) {
    	   System.out.println("C");
       }
       else {
    	   System.out.println("D");
       }
         
	}

}