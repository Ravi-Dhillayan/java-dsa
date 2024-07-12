package dsa;

import java.util.Scanner;

class Q{
	
	  int i = 0, n, s=-1,t = -1, item;
	    int[] a;
	    Scanner o;

	    public Q() {
	        o = new Scanner(System.in);
	        System.out.println("Enter the Size of Quek: ");
	        n = o.nextInt();
	        a = new int[n];
	    }
	void inserted() {
		if(s==n-1) {
			System.out.println("Quek is a Overflow : ");
		}
		else {
			if(s==-1) {
				s=t=0;
			}
			else {
				System.out.println("Enter the Quek Element ::");
				item=o.nextInt();
				a[s]=item;
				s++;
			}
			
		}
		
	}
	void delete() {
		if(s==-1) {
			System.out.println("Quek is a Underflow : ");
		}
		else {
			
			System.out.println("Delete Item from Quek ; "+a[t]);
			t++;
		}
	}
	void show() {
		if(s==-1) {
			System.out.println("Quek is a Empty :: ");
		}
		else {
			System.out.println("Showed your Quek is Printed :: ");
			for(i=t;i<s;i++) {
				System.out.println(a[i]);
			}
		}
	}
}
public class Quek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q s=new Q();
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
