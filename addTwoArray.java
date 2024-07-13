package array;
import java.util.Scanner;
public class addTwoArray
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Array size");
		int n=s.nextInt();
		
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		
		System.out.println("Enter 1st Array Elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter 2st Array Elements");
		for(int i=0;i<n;i++)
		{
			b[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			c[i]=a[i]+b[i];
		}
		System.out.println("\nSum of Array is:-");
		for(int x:c)
		{
			System.out.print(x+" ");
		}
	}

}
