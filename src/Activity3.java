import java.util.*;
public class Activity3 {  
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter the level of pyramid: "); 
		int n=sc.nextInt();  
		int i,j,a=1,b=2; 
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(j<n-i-1) 
				{ 
					System.out.println(" ");
				} 
				else { 
					System.out.println(a);
					a++;  
					if(a==10)
						a=0;  
				} 
			}
		if(a==1)
		{
			b=9;
		}else {
			b=a-2; 
		}
		for(j=0;j<i;j++)
		{
			System.out.print(b);  
			b--;  
			if(b==-1)
				b=9;
		}
		System.out.println(); 
	} 
} 
}
			
	


