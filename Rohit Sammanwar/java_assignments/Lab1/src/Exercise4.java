import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		System.out.println("Your required answer is: "+checkNumber(n) );
		sc.close();
	}
	public static boolean checkNumber(int n)
	{
		int num =n;
		boolean flag = true;
		while(true)
		{
			if(num%2 == 0)
			{
				num=num/2;
				if(num == 1)
				{
					break;
				}
			}
			else
			{
				flag = false;
				break;
			}
		}
		
		return flag;
	}

}
