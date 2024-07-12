package dsa;
import java.util.Scanner;

class Stack {
    int i = 0, n, st = -1, E;
    int[] a;
    Scanner o;

    public Stack() {
        o = new Scanner(System.in);
        System.out.println("Enter the Size of Stack: ");
        n = o.nextInt();
        a = new int[n];
    }

    void inserted() {
        if (st == n - 1) {
            System.out.println("Stack is Overflow.");
        } else {
            st++;
            System.out.println("Enter the Stack Element: ");
            E = o.nextInt();
            a[st] = E;
            System.out.println("Inserted Element: " + E);
        }
    }

    void delete() {
        if (st == -1) {
            System.out.println("Stack is Underflow.");
        } else {
            System.out.println("Deleted Item from Stack: " + a[st]);
            st--;
        }
    }

    void show() {
        if (st == -1) {
            System.out.println("Stack is Empty.");
        } else {
            System.out.println("Printed the Stack Element:");
            for (i = 0; i <= st; i++) {
                System.out.println(a[i]);
            }
        }
    }
}
public class Sstack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack s = new Stack();
	        int cs;
	        Scanner o = new Scanner(System.in);
	        while (true) {
	            System.out.println("1 Push\n2 Pop\n3 Display\n4 Exit");
	            cs = o.nextInt();
	            switch (cs) {
	                case 1:
	                    s.inserted();
	                    break;
	                case 2:
	                    s.delete();
	                    break;
	                case 3:
	                    s.show();
	                    break;
	                case 4:
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid Choice");
	            }
	        }
	}

}
