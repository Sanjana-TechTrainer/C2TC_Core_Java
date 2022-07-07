
public class Main {

	public static void main(String[] args) { 
		float a=4;//implicit
		char c=98;//implicit
		int b=(int)4.0;//explicit
		System.out.println((a<6) && (6!=b));//4<6 && 6!=4 = true&&true = true
		System.out.println(b&6);//4&6=0100&0110=0100=4
		System.out.println(b|8);//4|8=0100|1000=1100=12
		System.out.println(~b);//-(b+1)
		System.out.println(b++);//4
		System.out.println(++b);//6
		System.out.println(--b);//5
		System.out.println(b--);//5
		System.out.println(+b);//4
		System.out.println(-b);//-4
		
	}

}
/*
 * int ->4bytes=32bits
 * b=4= 0000 0000 0000 0000 0000 0000 0000 0100  + 
 * ~b=  1111 1111 1111 1111 1111 1111 1111 1011  -
 * MSB -> sign 
 * -ve->2's complement->1's complement+1
 * ~b=  1111 1111 1111 1111 1111 1111 1111 1011  -?
 * 		0000 0000 0000 0000 0000 0000 0000 0100
 * 											+ 1
 * 		0000 0000 0000 0000 0000 0000 0000 0101	  5	
 */
