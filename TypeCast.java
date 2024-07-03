package first;

public class TypeCast {

	public static void main(String[] args) {
       int a = 128;
       String b = Integer.toOctalString(a);
       System.out.println(b);
       
       float f = (float) 1.5; // OR
       float ff = 1.5f;
       // by default every real no in java is Double.
       // 0 and 1 in java is int.
       // boolean is true and false only.
       // We can use the double data type in Java when the memory is not a big concern, and if we want more accurate and precise results.
       // We can have n number of Main methods, but execution will start from one which has String array Argument in it.
	   // If 2 same main methods with same String Array Arguments, IDE will ask which to execute.
	}
	

}
