package sample;

public class samples {
	public static void main (String [] args, int sum)
	{
		int n=0,n1=1;sum=0;
		System.out.println(n+""+n1);
		for(int i=0;i<=10;i++)
		{
			sum=n+n1;
			n=n1;
			n1=sum;
			System.out.println(""+sum);
			
			
		}
		
	}

}
