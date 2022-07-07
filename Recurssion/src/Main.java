import java.util.Scanner;
class Main{ 
    public static void print_digits(int n){
        if(n <= 9){
            System.out.print(n);
        }
        print_digits(n / 10);
        System.out.print(n % 10);  
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        print_digits(n);
    }
}
