package array;
import java.util.Scanner;
public class secondHighestNo
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Array size: ");
		int n=s.nextInt();
		int t;
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Array Element "+i);
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("\nSecond Highest Number is "+a[a.length-2]);
		
	}

}
