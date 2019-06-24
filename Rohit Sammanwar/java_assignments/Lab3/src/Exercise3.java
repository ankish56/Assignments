import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of elements:");
		int tot = sc.nextInt();
		int a[] = new int[tot];
		
		System.out.println("Enter the elements");
		for(int i = 0; i < tot ; i++)
		{
			a[i] = sc.nextInt();
		}
		a = getSorted(a,tot);
		
		for(int b : a)
			System.out.println(b);

		sc.close();
	}
	public static int[] getSorted(int[] a,int tot)
	{
		String str[] = new String[tot];
		for(int i = 0; i <tot ;i++) 
		{
			StringBuffer sb = new StringBuffer();
			 sb.append(Integer.toString(a[i]));
			 sb.reverse();
			 str[i] = sb.toString();
		}
		for(int i = 0; i <tot ;i++) 
		{
			a[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(a);
		return a;
	}

}
