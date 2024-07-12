package dsa;

import java.util.Scanner;

class Bin{
	
	String s;
	public
	Bin() {
		int n,base=1,ans=0;
		System.out.println("Your Enter the Binary number and change the decimal Number :: ");
		Scanner o=new Scanner(System.in);
		s=o.nextLine();
		n=s.length();
		System.out.println("Your Number Change the Decimal Number : ");
		for(int i=n-1;i>=0;i--) {
			if(s.charAt(i)=='1') {
				ans=ans+base;
			}
//			System.out.println(ans);
			base=base*2;
		}
		System.out.println(ans);
	}
	void decimal() {
		int n,flag=1;
	
		System.out.println("You Enter the Decimal number and Change the Binary Number : ");
		Scanner o=new Scanner(System.in);
		n=o.nextInt();
		System.out.println("your Number Change the Binary Number : ");
		for(int i=4;i>=0;i--) {
			int k=n>>i;
//			System.out.println("hello  "+k);
			if((k&1)>0) {
				flag=1;
				System.out.print(1);
			}
			else {
				if(flag==1) {
					System.out.print(0);
				}
			}
		}
	}
	void Deim() {
		int n,pow=1,i=0;
		int[] bin=new int[32];
		System.out.println("You Enter the Decimal number and change the Binary Number : ");
		Scanner o=new Scanner(System.in);
		n=o.nextInt();
		while(n>0) {
		bin[i]=n%2;
		i++;
		n=n/2;
			
		}
		System.out.println("You Number change the Binary Number : ");
		for(int j=i-1;j>=0;j--) {
			System.out.print(bin[j]);
		}
	}
	void decimal1() {
		int n,base=1,ans=0;
		int[] s=new int[32];
		System.out.println("You Enter the Decimal number and Change the Binary Number : ");
		Scanner o=new Scanner(System.in);
		n=o.nextInt();
		System.out.println("your Number Change the Binary Number : ");
		while(n>0) {
			s[ans]=n%2;
			ans++;
			n=n/2;
		}
	
		for(int ind=ans-1;ind>=0;ind--) {
			System.out.print(s[ind]);
		}
	}
}
public class Binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Bin obj=new Bin();
//  obj.decimal();
//  obj.Deim();
    obj.decimal1();
	}

}
