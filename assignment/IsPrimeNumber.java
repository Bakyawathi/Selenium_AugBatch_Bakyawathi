package day2.assignment;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value= {1,2,3,4,5,6,7,8,9};
		for(int i = 0;i<value.length-1;i++)
		{
			if(i%i+1==1)
			{
				System.out.println("the number is prime" +1);
			}
			
		}

	}

}
