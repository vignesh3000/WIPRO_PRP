import java.util.*;
public class Activity2 { 
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in); 
		int a[]=new int[10]; 
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}   
		int max=a[0];
		for(int i=0;i<10;i++)
		{ 
			if(a[i]>max) 
			{
				max=a[i];
			}
			
		} 
		int c=0; 
		for(int i=0;i<10;i++) 
		{ 
			if(a[i]==max) 
			{
				c++;
			}
		} 
		System.out.println(c);
	}

}
