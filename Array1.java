import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array1 {
	
	public static void main(String[] args)
	{
		int[]a1= {5,2,0,1,8,1,0,4,6};
		//Array traversing
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		//Array Minimum
		 int min=a1[0];
		 for(int i=0;i<a1.length;i++)
			{
				if(a1[i]<min)
				{
					min=a1[i];
					continue;
				}
			}
		 System.out.println(min);
		 
		 //Array reverse
		for(int i=a1.length-1;i>=0;i--)
		{
			System.out.println(a1[i]);
		}
		
		//Array Ascending order
		for(int i=0;i<a1.length;i++) 
		{
			for(int j=i+1;j<a1.length;j++)
			{
				int temp=0;
				if(a1[i]>a1[j])
				{
					temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
			}
			
			
		}
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		//Dupicate in Array
		
		Set<Integer> s1=new HashSet<Integer>();
		for(int i:a1)
		{
			if(s1.add(i)==false)
			{
				System.out.println("Duplicate found "+i);
			}
		}
		//Separate Zeroes and push them in end
		int count=0;
		for(int i=0;i<a1.length;i++) 
		{
			if(a1[i]>0)
			{
				a1[count++]=a1[i];
			}
		}
		while(count<a1.length)
		{
			a1[count++]=0;
		}
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		//Separate Zeroes and push them in front
		
		int count1=a1.length-1;
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]>0)
			{
				a1[count1--]=a1[i];
			}
		}
		while(count1>=0)
		{
			a1[count1--]=0;
		}
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		//Fibonacci series
		int n1=1;
		int n2=1;
		int sum=0;
		System.out.print(n1+" "+n2);
		for(int i=2;i<=10;i++)
		{
		    sum=n1+n2;
		    n1=n2;
		    n2=sum;
		   
		 	System.out.print(" "+sum);   
		}
	}
	
	
	

}
