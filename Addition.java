package first;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter First Number:");
 
    String firstNo = myObj.nextLine();
    int fno = Integer.parseInt(firstNo);
    System.out.println("First Number is:" + firstNo);
    
    System.out.println("Enter Second Number:");
 
    String secondNo = myObj.nextLine();
    int sno = Integer.parseInt(secondNo);

    System.out.println("Second Number is:" + secondNo);
    int sum = fno + sno;
    
    System.out.println("Addition is :" + sum);
	}

}
