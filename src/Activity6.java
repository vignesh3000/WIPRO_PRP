import java.util.*;
public class Activity6 { 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();  
		char a[]=s.toCharArray(); 
		int b=0; 
		for(int i=0;i<a.length;i++)
		{
			int j; 
			for(j=0;j<i;j++)
			{
				if(a[i]==a[j]) 
				{ 
					break;
				}
			} 
			if(j==i) 
			{ 
				a[b++]=a[i];			
			}
		} 
		System.out.println(String.valueOf(Arrays.copyOf(a, b)));
	}

}
