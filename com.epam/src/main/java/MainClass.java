import java.util.Scanner;
public class MainClass extends Calculator {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter 1st number:");
		a = sc.nextInt();
		System.out.println("Enter 2nd number:");
		b = sc.nextInt();
		System.out.println("Enter operator:");
		char ch = sc.next().charAt(0);
		int solution = 0;
		switch(ch)
		{
		case '+':
			solution = add(a,b);
			break;
		case '-':
			solution = sub(a,b);
			break;
		case '*':
			solution = mul(a,b);
			break;
		case '/':
			solution = div(a,b);
			break;
		default:
			System.out.println("App under construction");
		}
		System.out.println(a+" "+ch+" "+b+" = "+solution);
	}
}
