import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		System.out.println("Your required answer is: "+checkNumber(n) );
		sc.close();

	}
	public static boolean checkNumber(int n)
	{
		String num = Integer.toString(n);
		boolean flag = true;
		for(int i = 0; i <num.length()-1;i++)
		{
			if(num.charAt(i)>num.charAt(i+1))
			{
				flag = false;
				break;
			}
		}
		return flag;
	}

}
