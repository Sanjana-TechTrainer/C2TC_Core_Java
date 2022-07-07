package tnsif.c2tc.b18.wrapperclass;

public class Main {
	public static void main(String[] args) {
		//autoboxing
		int a=10;//Primittive
		Integer obj=a;//object
		//unboxing
		Integer num=new Integer(20);// object
		a=num;//primitive
		System.out.println(obj);
		System.out.println(a);
	}

}
