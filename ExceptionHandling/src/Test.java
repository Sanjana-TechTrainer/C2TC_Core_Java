/*
 * 1st July
 * Exception Handling example showing try catch and finally
 *
 */
import java.util.*;
public class Test{  
  public static void main(String args[]){  
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int count=0;
    for(int i=0; i<=n; i++){   
       try{ 
    	   //System.out.print(i+" ");
    	   int data=100/i;  
           System.out.println(data);
       }
       catch(ArithmeticException e){
    	   count++;
           System.out.println(e);
          // System.out.print(i+" ");
       }
       finally
       {
           if(i==n)
           {
           if(count==0 )
           System.out.println("No exception ");
           else
           System.out.println(count +" exception handled");
           }
       }
    } 
  }  
}  
