import java.util.Scanner;

public class ReverseOfAnArray {
    static int  printArray(int arr[],int i){
        int sum=0;
        if(i==arr.length){
            return 0 ;
        }
        else {
            System.out.print(arr[i]);

            int result  = printArray(arr, i + 1);
            result  = result + arr[i];

        }
        return sum ;

    }
    public static void main(String[] args) {
        int[] arr={1,4,2,5,8};
        int i=0;
        printArray(arr,i);
    }

}
