
public class Task1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    short a=5;
    short b=7;
        System.out.println(+a);
        System.out.println(-a);
        System.out.println(++b);
        System.out.println(++);
        System.out.println(--b - b--);
        
    //    short c=+a;   // when we want to intialize short variable in third short variable it give error because in java defaultly the variable intialization in short is taken as integer varaible so we have to change short to integer variable
        int  c=+a;
        System.out.println(c);
        
       // byte d=+b;  // in byte also it gives same error so we have to change it to integer
        int d=+b;
        System.out.println(d);
	}

}
