
import java.util.*;

public class Main{  
  public static void main(String args[]){  
	  Scanner s=new Scanner(System.in);
	  int num=s.nextInt();
	  try {
		  System.out.println(10/num);
		  int arr[]=new int[num];
		  System.out.println(arr[num]);
	  }
	  /*catch (ArithmeticException e)
	  {
		  System.out.println("Division not allowed");
	  }
	  catch (IndexOutOfBoundsException e)
	  {
		  System.out.println("check your array");
	  }*/
	  catch (Exception e)
	  {
		  System.out.println("Division not allowed");
	  }
    
  }  
}
