package day2.assignment;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
	int	a=0;
		int b =1;
		int c;
		
		System.out.println("Fibonacci series upto " +n +"numbers");
		for(int i=2;i<=n;i++)
		
		{
			System.out.println(a +" ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
