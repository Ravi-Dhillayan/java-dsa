package dsa;

import java.util.Scanner;

class search{
	int i,n,item,temp;
	int[] a;
	Scanner o;
	public
	  search() {
        o = new Scanner(System.in);
    }
	void Learning_Search() {
		System.out.println("Enter the Size of Learning Search ");
		n=o.nextInt();
		
		a=new int[n];
		System.out.println("Enter the Learning search Elemtent :: ");
		for(i=0;i<n;i++) {
			a[i]=o.nextInt();
		}
		System.out.println("Who Many Element Search in Learning Element : ");
		item=o.nextInt();
		temp=-1;
		for(i=0;i<n;i++) {
			if(item==a[i]) {
			 temp=item;
			}
		}
		if(temp==item) {
			System.out.println("Element is a found in Learning Search :: "+temp);
		}
		else {
			System.out.println("Sorray !!! Not found ---");
		}
	}
	void Binary() {
		System.out.println("Enter the Size of Binary Search ");
		n=o.nextInt();
		
		a=new int[n];
		System.out.println("Enter the Binary search Elemtent :: ");
		for(i=0;i<n;i++) {
			a[i]=o.nextInt();
		}
		System.out.println("Who Many Element Search in Learning Element : ");
		item=o.nextInt();
		int f=0,l=n;
		int mid=(f/l);
		boolean t=true;
		while(t) {
			if(a[mid]==item) {
				t=false;
			}
			else if(a[mid]<item) {
				mid++;
			}
			else if(mid>n) {
				t=false;
			}
			else {
				--mid;
			}
		}
		System.out.println(mid+" "+ a[mid]);
		if(a[mid]==item) {
			System.out.println("Element is a found in Binary Search :: "+a[mid]);
		}
		else {
			System.out.println("Sorray !!! Not found ---");
		}
	}
}

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   search obj=new search();
//   obj.Learning_Search();
   obj.Binary();
	}

}
