import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean flag=false;
		int i=0;
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int [size];
		for( i=0;i<size;i++)
			arr[i]=sc.nextInt();
		int key=sc.nextInt();
		for( i=0;i<size;i++)
		{
			if(arr[i]==key)
			{
				flag=true;
				break;//pos=i+1
			}
		}
		if (flag)
				System.out.println("Position of "
								+key +" is "+(i+1));//+key +" is "+pos
		else
				System.out.println("Element is not found");
		
	}

}
