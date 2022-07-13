package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 5, i, j = 0;
		  
		  for (i = 2; i <= n / 2; ++i) {

		    if (n % i == 0) {
		      j = j+1;
		    
		    }
		  }

		
		  if (j > 0)
			  System.out.print("prime number");
		  else
			  System.out.print("not prime number");

	}

}
