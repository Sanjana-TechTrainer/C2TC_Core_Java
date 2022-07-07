import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuffer sb=new StringBuffer(str);
        /*for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)>='a' && str.charAt(i)<='z')
        	{
        		ch=(char) (str.charAt(i)-32);
        	}
        	else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
        	{
        		ch=(char) (str.charAt(i)+32);
        	}
        	else
        	{
        		ch=str.charAt(i);
        	}
        	sb.setCharAt(i, ch);
        }*/
        char arr1[]=str.toCharArray();
        char ch;
        int index=0;
        for(char i:arr1)
        {
        	
        	if(i>='a' && i<='z')
        	{
        		ch=(char) (i-32);
        	}
        	else if(i>='A' && i<='Z')
        	{
        		ch=(char) (i+32);
        	}
        	else
        	{
        		ch=i;
        	}
        	sb.setCharAt(index++, ch);
        }
        System.out.println(sb);
    }
}
/*
I am Sanjana
i AM sANJANA
*/
