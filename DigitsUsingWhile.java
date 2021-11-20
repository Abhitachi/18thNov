package tap.Geek;
import java.util.Scanner;
public class DigitsUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
		if(n==0) {
			System.out.println(1);
		}
		else {
			while(n!=0){
				n=n/10;
				count++;
			}
			System.out.println(count);
		}
		
	}

}
