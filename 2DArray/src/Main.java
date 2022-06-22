import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int [row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j==0)
					System.out.print(arr[j][i]);
				else
					System.out.print(","+arr[j][i]);
			}
			//System.out.println();
			System.out.print("\n");
		}
		
	}

}
/*
arr1
1 2 3 
4 5 6
7 8 9

arr2
1 4 7
2 5 8
3 6 9

0,0->0,0
0,1->1,0
1,2->2,1

*/