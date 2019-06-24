import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
public static void main(String[] args) {
	int a[] = new int[100];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the total number of elements:");
	int tot = sc.nextInt();
	
	System.out.println("Enter the elements");
	for(int i = 0; i < tot ; i++)
	{
		a[i] = sc.nextInt();
	}
	System.out.println("Second largest is: "+getSecondSmallest(a));
	sc.close();
	
	
}
public static int getSecondSmallest(int a[]) {
	Arrays.sort(a);
	int b = a[a.length-2]; 
	return b;
}

}
