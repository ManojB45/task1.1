package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pattern {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of lines:");
        int n=Integer.parseInt(bufferedReader.readLine());
        
        for(int i=n,n1=n;i>=1;i--)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            for(int j=1;i!=1 && j<i;j++)
            {
                System.out.print(n1+" ");
            }
            
            System.out.println();
            n1=n1-1;
        }
		
		
	}

}
