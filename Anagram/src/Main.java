
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		char temp;
		char arr1[]=A.toLowerCase().toCharArray();
		char arr2[]=B.toLowerCase().toCharArray();
		if(A.length()!=B.length())
		{
			System.out.println("Not Anagram");
		}
		else
		{
			for(int i=0;i<A.length();i++)
				for(int j=i+1;j<A.length();j++)
					if(arr1[i]>arr1[j])
					{
						temp=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=temp;
					}
			A=new String(arr1);
			Arrays.sort(arr2);
			B=new String(arr2);
			if(A.equalsIgnoreCase(B))
				System.out.println("Anagram");
			else
				System.out.println("Not Anagram");
		}
		
		
	}

}
/* 
 * 8 10 9 4 1
 * 4 10 9 8 1
 * 1 10 9 8 4
 */
