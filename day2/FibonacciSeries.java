package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int a,b,c;
		a=0;b=1;
		System.out.println("Fibonacci Series are "+a);
		System.out.println(b);
		
		for(int i=2;i<=8;i++)
		{
			
			//int a,b,c;
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
