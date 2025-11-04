import java.util.Scanner;

public class SumFirstnNumber {
    static int sum=0;
    static void sumnnumber(int i,int n){
        if(i>n){
            System.out.println( "The sum of First N Number is :" + sum);
            return;
        }
        else{
            sum=sum+i;
            //System.out.println(i);
            sumnnumber(i+1,n);
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n= sc.nextInt();
        sumnnumber(1,n);
    }
}
