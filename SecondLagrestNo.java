package array;
import java.util.Scanner;
public class SecondLagrestNo 
{
	public static void main(String[] args)
	{
		
		int a[]= {2,3,4,78,57,68,100,95};
		int max=a[0],smax=a[0],min=a[0];
		for(int i=0;i<a.length;i++)
		{
				if(a[i]>max)
				{
					smax=max;
					max=a[i];
				}
				else if(a[i]>smax)
				{
					smax=a[i];
				}
				else if(a[i]<min)
				{
					min=a[i];
				}
			
		}
		System.out.println("Max No Is :-"+max);//100
		System.out.println("SecondMax is :- "+smax);//95
		System.out.println("Smallest No is :- "+min);//2
		
		
		/* // SecondMax Without Array  
		Scanner s=new Scanner(System.in);
		int n;
		int max=0,smax=0;
		System.out.println("Enter Number");
		for(int i=1;i<=5;i++)
		{
			//System.out.println("Enter No. " +i);
			n=s.nextInt();
			if(n>max)
			{
				smax=max;
				max=n;
			}
			else if(n>smax)
			{
				smax=n;
			}
				
		}
		//System.out.println(max);
		System.out.println("SecondMax Is "+smax);
		*/
		
		/*  // MAX and MIN of a Number
		Scanner s=new Scanner(System.in);
		int n;
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		System.out.println("Enter Number");
		for(int i=1;i<=5;i++)
		{
			n=s.nextInt();
			if(n>max)
			{
				max=n;
			}
			if(n<min)
			{
				min=n;
			}
		}
		System.out.println(max);
		System.out.println(min);
		*/
	}

}
