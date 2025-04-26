
public class IncreDecre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=5;
    int b=2;
    
    
    System.out.println(a++);   // a is incremented after the statement executes
    System.out.println(b++);   // b is also
    System.out.println(a);    // increment   6
    System.out.println(b);     // 3
    System.out.println(++a);   // a is 7 preincrement so it increments before it executes statement
    System.out.println(++b);   // b is also
    System.out.println(++a + a++);     // first  a is preinc so 7 -> 8 + 8 =16
    System.out.println(b++ + ++b);     // 4 + 4->5 = 4+5 =9
    
    //DECREMENT
    
    System.out.println(--a);
    System.out.println(b--);
    System.out.println(a--);
    System.out.println(--b);
    System.out.println(b);
    System.out.println(a);
    System.out.println(--a - a-- + --a - a--);     
    System.out.println(a-- - --a - b-- - --b);
	}

}
