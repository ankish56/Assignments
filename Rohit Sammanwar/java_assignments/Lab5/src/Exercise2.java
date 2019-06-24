import java.util.Scanner;

public class Exercise2 {
public static void main(String[] args) {
	System.out.println("Enter the nth element to be accessed by fibonacchi series!");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	System.out.println("Which Function would you like to use?");
	System.out.println("1.recursive");
	System.out.println("2.non-recursive");
	int c = sc.nextInt();
	switch(c) {
	case 1 : System.out.println("nth fibo element is="+fibonacci(a-1));
			break;
	case 2 : System.out.println("nth fibo element is="+nonRecursiveFunction(a));
			break;
	default:
		System.out.println("Enter valid option...");
	}
	sc.close();
}

public static int fibonacci(int n)  {
    if(n == 0)
        return 0;
    else if(n == 1)
      return 1;
   else
      return fibonacci(n - 1) + fibonacci(n - 2);
}

public static int nonRecursiveFunction(int n)
{
	 int n1=0,n2=1,n3=0,i,count=n;    
	    
	 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  n3=n1+n2;       
	  n1=n2;    
	  n2=n3;    
	 }    
	return n3;
}
}

