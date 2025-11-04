import java.util.*;
public class PrintName {
    static int count=0;
    static void Print5name(String name){
        if(count==5){
            return;
        }
        else{
            System.out.println(name);
            count++;
            Print5name( name);
        }
//        while (count !=5){
//            System.out.println();
//            count++;
//        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("hoe many times do you want print that number:");
//        int n= sc.nextInt();
        System.out.println("Enter the Name:");
        String  name = sc.nextLine();
        Print5name(name);

    }
}
