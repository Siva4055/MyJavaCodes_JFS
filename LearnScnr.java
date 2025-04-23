import java.util.Scanner;
public class LearnScnr {

	public static void main(String[] args) {
		System.out.println("enter inputs");
		Scanner sc=new Scanner (System.in);   // to take input from user
		String grade=sc.next();// not include spaces like Siva Dastagiri it gives o/p as Siva , itr executes only upto spaces but not include spaces
		sc.nextLine();
		String name=sc.nextLine(); //take  including  from user as string 
		int age=sc.nextInt();   //take input as integer we use nextInt
		 float percentage=sc.nextFloat(); //to take decimal values and .after 7 digits it includes in output 
		 double  salary=sc.nextDouble(); // takes decimal values as big and .after 16 digits includes
		 long number =sc.nextLong(); // it takes long numbers which integer cant gives
		 boolean result =sc.nextBoolean(); // it checks true or false by condition if gives or manually takes from user
	    System.out.println("age " +age);
	    System.out.println("name " +name);
	     System.out.println("grade " +grade);
	    System.out.println("percent " +percentage);
	    System.out.println("salary " +salary);
	    System.out.println("number " +number);
	    System.out.println("res " +result);
		 }

}
