import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		System.out.println("Enter the number of primes you want:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int flag =0 ;
		

			for(int i = 2; i < a ; i ++)
			{
				flag =0;
				for(int j = 2 ; j<i;j++)
				{
					if(i%j == 0)
					{
						flag = 1;
					}
				}
				if(flag == 0)
				{
					System.out.println(i);
					
				}
		}
			
			sc.close();
	}

}
