package first;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter any Number:");
	 
	    String No = myObj.nextLine();
	    int No1 = Integer.parseInt(No);
	    if((No1%2)==0) {
	    	System.out.println("Even Number");
	    }else {
	    	System.out.println("Odd Number");
	    }

	}

}
