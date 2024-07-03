package first;
import java.util.Scanner;

public class welcome_2S {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your name : ");
		
		String name = myObj.nextLine();
		System.out.println("Welcome " + name);

	}

}
