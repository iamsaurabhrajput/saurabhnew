import java.util.*;
public class PrintOneToN {
    static void onetoN(int i,int n){
        if(i>n){
            return;
        }
        else{
            System.out.println(i);
            onetoN(i+1,n);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        onetoN(1,n);

    }
}
