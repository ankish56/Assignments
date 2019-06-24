import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		//System.out.println((int)5/2);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of objects");
		int tot = sc.nextInt();
		String str[] =new String[tot];
		System.out.println("Enter the objects:-");
		for(int i = 0; i < tot;i++)
		{
			str[i] = sc.next();
		}
		Arrays.sort(str);
		str = getElements(str);
		for(String a : str)
			System.out.println(a);
		sc.close();
		
	}
	public static String[] getElements(String str[])
	{
		int alen = str.length;
		if((alen%2)==0)
		{
			int a = (int)(alen/2);
			int b = a+1;
			for(int i=0; i < a;i++ )
			{
				str[i]=str[i].toUpperCase();
			}
			for(int i=a; i < b;i++ )
			{
				str[i]=str[i].toLowerCase();
			}
		}
		else
		{
			int a = (int)(alen/2)+1;
			int b = a;
			for(int i=0; i < a;i++ )
			{
				str[i]=str[i].toUpperCase();
			}
			for(int i=a; i < b;i++ )
			{
				str[i]=str[i].toLowerCase();
			}
		}
		
		return str;
	}

}
