package first;
import java.util.*;

public class StringRev {

	       public static void main(String[] args) {
		        
		        Scanner myObj =new Scanner(System.in);
		        String A = myObj.next();
		        String rev = "";
		        for(int i=0;i<A.length();i++){
		            rev = A.charAt(i) + rev;
		        }
		        System.out.println(rev);
		    }

}
