import java.util.*; 
public class Activity14 { 
	static int gcd(int x,int y)
	{ 
		if(y==0)
			return x; 
		return gcd(y,x%y); 
	}
	public static void main(String[] args) 
	{ 
		int x=43,y=91,z=183; 
		int r=gcd(y-x,z-y); 
		System.out.println(gcd(r,z-x));
	}
}
