package dsa;

import java.util.Scanner;

class clas{
	public
		void Bi() {
		int base=1,ans=0,i;
		String n;
		
		System.out.println("Enter the Number you are chage Binary to Decimal : ");
		Scanner o=new Scanner(System.in);
		n=o.nextLine();
		int a=n.length();
		System.out.println("Your Number change Binary to Decimal : ");
		for(i=a-1;i>=0;i--) {
			if(n.charAt(i)=='1') {
				ans+=base;
			}
			base*=2;
		}
		System.out.println(ans);
	}
	void De() {
		int n,p,r,s,i=0;
		int[] a=new int[32];
		System.out.println("Enter the number you are change Decimal to Binary : ");
		Scanner o=new Scanner(System.in);
		n=o.nextInt();
			while(n>0) {
			a[i]=n%2;
			i++;
			n=n/2;
		}
			System.out.println("Your Number Change Decimal to Binary : ");
	      for(r=i;r>=0;r--) {
	    	  System.out.print(a[r]);
	      }
	}
}

public class decimaltobin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   clas obj=new clas();
//   obj.Bi();
    obj.De();
	}

}
