import java.util.Scanner;

public class FctorialOfNnumber {
    static int fact=1;
    static void factorial(int i, int n){
        if(i>n){
            System.out.println(fact);
            return;
        }
        else {

            fact=fact*i;
            factorial(i+1,n);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n= sc.nextInt();
        factorial(1,n);

    }
}
