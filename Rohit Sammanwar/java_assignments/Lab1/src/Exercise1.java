import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		System.out.println("Your required answer is: "+calculateSum(n) );
		sc.close();
	}
	public static int calculateSum(int n)
	{	int sum = 0;
		for(int i = 1; i <=n ; i++)
		{
			if((i%3 == 0)||(i%5 == 0))
			{
				sum = sum+i;
			}
		}
		return sum;
		
	}
}
