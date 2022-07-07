
public class Main {

	public static void main(String[] args) {
		int num=459;
		boolean flag=((num&1)==0)?true:false;
		if(flag)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}

}
/*

4- 100 & 1 =0 
6- 110 & 1 =0
9- 1001 & 1=1
5- 0101 & 1= 1
*/