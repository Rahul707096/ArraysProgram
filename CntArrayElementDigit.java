package array;

public class CntArrayElementDigit
{

	public static void main(String[] args) 
	{
		int a[]= {35,871,5624,9421};
		int cnt,n,r;
		for(int i=0;i<a.length;i++)
		{
			n=a[i];
			cnt=0;
			while(n!=0)
			{
				r=n%10;
				cnt++;
				n=n/10;
			}
			System.out.println(i+" :- "+cnt);
		}

	}

}
