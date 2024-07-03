import java.io.*;
import java.util.*;

public class Reverse{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rev = "";
        for(int i=0;i<A.length();i++){
            rev = A.charAt(i) + rev;
        }
        System.out.println(rev);
    }
}


