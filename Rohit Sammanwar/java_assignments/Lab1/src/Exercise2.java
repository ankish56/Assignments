import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		System.out.println("Your required answer is: "+calculateDifference(n) );
		sc.close();
	}
	public static int calculateDifference(int n)
	{
		int sum=0,sum1=0,sum2=0;
		for(int i=1; i<=10; i++) {
			sum = sum + (i*i);
		}
		for(int i=1; i<=10; i++) {
			sum1 = sum1 + i;
			if(i == 10)
			{
				sum1 = sum1*2;
				break;
			}		
		}
		sum2 = sum-sum1;
		return sum2;
	}

}
