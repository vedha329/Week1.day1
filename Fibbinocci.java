package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		int n=5, a=1, b=1, i, c;  
		 for(i=2;i<n;i++)
		 {  
			c = a+b;
     		System.out.print(c);
		    a=b;
			b=c;
			 }
		 }
	}

		 

	


