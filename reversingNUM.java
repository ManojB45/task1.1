package task1;

import java.util.Scanner;

public class reversingNUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=input.nextInt();
		
		int rem=0, rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		
		
	}

}
