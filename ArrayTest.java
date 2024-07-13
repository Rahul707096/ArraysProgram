package array;
import java.util.Arrays;
public class ArrayTest 
{
	public static void main(String args[])
	{
		
		/*
		System.out.println("First Array");
		for(int x:ar)
		{
			System.out.print(x+" ");
		}
		System.out.println("\nSecond Array");
		for(int a:ar2)
		{
			System.out.print(a+" ");
		}
	}
   public static void main(String args[])
   {
	   int a[]= {3,4,3,2,3,6};
	   int b[]= {3,4,3,2,4,22,78};
	   ArrayTest ar=new ArrayTest();
	   ar.disp(a,b);
	   */
	   
	   
	   /*    // Count words 
	   String s1= "Today is Monday and Tommorow"; // 5
	   int cnt=0;
	   String a[]=s1.split(" ");
	   for(String x:a)
	   {
		   cnt++;
		  // System.out.println(x);
	   }
	   System.out.println(cnt);
	   */
	   
	   /*	 // Second largest element of the array---
	   int a[]= {2,4,53,3,4,8};
	   int max=0,smax=0;
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=i+1;j<a.length;j++)
		   {
			   if(a[i]>a[j])
			   {
				   max=a[i];
			   }
			   if(a[j]<max || a[j]>max)
			   {
				  smax=a[j];
			   }
		   }
	   }
	   
	  // System.out.println(max);
	   System.out.println(smax);
	   */
	   
	   
	   /* // Largest Difference of Two No.
	   int a[]= {2,3,10,6,4,8,1};
	   int max=0,d=0,x=0,y=0;
	   
	   System.out.println();
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=i+1;j<a.length;j++)
		   {
			   if(a[i]<a[j])
			   {
				   d=a[j]-a[i];
				   x=a[i];
				   y=a[j];
				   if(d>max)
				   {
					   max=d;
				   } 
			   }
			   System.out.println(x+" - "+y+" = "+d);
		   } 
	   }
	   System.out.println("largest diff is " + max);
	  */
	   
	   
	   /*
	   	// Triplets Max Product
	   //int a[]= {-10,-3,-5,6,-20};
	   int a[]= {10,3,5,6,20};
	   int max=0,p=0,x=0,y=0,z=0;
	   for(int i=0;i<a.length-2;i++)
	   {
		   for(int j=i+1;j<a.length-1;j++)
		   {
			   for(int k=i+2;k<a.length;k++)
			   {
				   p=a[i]*a[j]*a[k];
				   if(p>max)
				   {
					   max=p;
					   x=a[i];
					   y=a[j];
					   z=a[k]; 
				   }
			   }
		   }
	   }
		System.out.println(max+" Multiplication of "+x+" ,"+y+" and "+z);
	   // o/p-> 1200 Multiplication of 10 ,6 and 20
	   */
	   
	   /*// Triplets Max Product
	   int a[]= {10,3,5,6,20};
	   int temp=0;
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=i+1;j<a.length;j++)
		   {
			   if(a[i]<a[j])
			   {
				   temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
			   }
		   }
	   }
	   int t=a[0]*a[1]*a[2];
	   System.out.println(t+" Multiolication of "+a[0]+", "+a[1]+"and "+a[2]);
	   
	   */
	   
	   /*  //Missing Elements
	   int a[]= {1,14,11,51,15};
	   int low=50,high=55;
	   int p;
	   System.out.println("Missing Element is:-");
	   for(int i=low+1;i<high;i++)
	   {
		   p=0;
		   for(int j=0;j<a.length;j++)
		   {
			   if(a[j]==i)
			   {
				  p=1;
				  break;
			   }
		   }
		   if(p==0)
		   {
			   System.out.println(i);
		   }
	   }
	*/
	
		/*
		int a[]= {78,77,78,17,71,17,78};
		int cnt;
		for(int i=0;i<a.length;i++)
		{
			cnt=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
			if(cnt==1)
			{
				System.out.println(a[i]);
			}
			}
			*/
			
		/*  Update Array Element
		int a[]= {1,2,3,5,6};
		int b[]=new int[a.length+1];
		int el=4,e=0;
		for(int i=0;i<b.length;i++)
		{
			if(i<3)
			{
				b[i]=a[i];
			}
		else if(i==3)
			{
				b[i]=el;
			}
			else 
			{
				b[i]=a[i-1];
			}
		}
		for(int x:b)
		{
			System.out.print(x+" ");
		}
		*/
		
		   int a[]= {10,3,5,6,20};
		   Arrays.sort(a);
		   for(int x:a)
		   {
			   System.out.print(x+" ");
		   }
		   /*
		   int temp=0;
		   for(int i=0;i<a.length;i++)
		   {
			   for(int j=i+1;j<a.length;j++)
			   {
				   if(a[i]>a[j])
				   {
					   temp=a[i];
					   a[i]=a[j];
					   a[j]=temp;
				   }
			   }
		   }
		   for(int x:a)
		   {
			   System.out.print(x+" ");
		   }
		   */
   }

}
