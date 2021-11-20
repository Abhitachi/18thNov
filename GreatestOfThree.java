package tap.Geek;

import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number");
		int m=sc.nextInt();
		System.out.println("Enter the Second number");
		int n=sc.nextInt();
		System.out.println("Enter the Third number");
		int o=sc.nextInt();
		int greatest;
		greatest=(m>n)?((m>o)?m:o):((n>o)?n:o);
		System.out.println("Greatest of Three is"+" "+greatest);
	}

}
