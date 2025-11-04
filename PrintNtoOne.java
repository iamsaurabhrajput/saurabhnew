import java.util.Scanner;

public class PrintNtoOne {
    static void ntoone(int i,int n){
        if(i<1){
            return;
        }else{
            System.out.println(i);
            ntoone(i-1,n);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        int i=n;
//        ntoone(n,n);
        ntoone(i,n);
    }
}
