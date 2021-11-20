package tap.Geek;
import java.util.Scanner;
public class GreatestOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number");
		int n=sc.nextInt();
		System.out.println("Enter the Second number");
		int m=sc.nextInt();
		int b,greater;
		b=(n>m)?(greater=n):(greater=m);
		System.out.println("Greater number is"+" "+greater);
		
	}

}
