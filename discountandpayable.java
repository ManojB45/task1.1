package task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class discountandpayable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner data=new Scanner(System.in);
		float amount=0, payabelamount=0;
		System.out.println("enter the shopping amount");
		amount=data.nextFloat();
		
		if(amount<=500)
		{
			payabelamount=amount;
		}
		
		else if(amount>=500 && amount<=1000)
		{
			payabelamount=amount-((amount*10)/100);
		}
		else if(amount>=2000)
		{
			payabelamount=amount-((amount*20)/100);
		}
		
		System.out.println("the payable amount is"+payabelamount);
	}

}
