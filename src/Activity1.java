import java.util.*; 
public class Activity1 { 
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);  
		int a[]=new int[25]; 
		for(int i=0;i<25;i++)
		{
			a[i]=sc.nextInt();
		}  
		int max=a[0];
		for(int i=0;i<25;i++) 
		{ 
			if(a[i]>max) 
			{
				max=a[i]; 
			}
			
		} 
		System.out.println(max);
		
	}

}
