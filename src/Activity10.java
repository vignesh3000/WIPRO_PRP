import java.util.*;
public class Activity10 { 
	public static void main(String[] args) 
	{ 
		int i=8; 
		int v=i*i; 
		while(true)
		{ 
			v=i*i; 
			if(v%21==0 && v%36==0 && v%66==0)
			{
				break;
			}  
			i++;
		} 
		System.out.println(v);
		
	}

}
