package task1;

public class smallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a=15,b=25,c=35;
		
		if(a<b && a<c)
		{
			System.out.println(a+" is smallest no");
		}
		else if(b<a && b<c )
		{
			System.out.println(b+"is  smallest no:");
		}
		else if(c<a && c<b)
		{
			System.out.println(c+"is  smallest no:");
		}
		
		else
		{
			System.out.println("number not exits");
		}
	}

}
