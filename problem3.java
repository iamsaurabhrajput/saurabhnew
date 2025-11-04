public class problem3 {
    static void helper(int target , String ans){

        if (target ==0){
            System.out.println(ans);
            return;

        }
        helper(target-1,ans+"1");
        if(target-2>=0){
            helper(target-2,ans+"2");
        }
    }
    public static void main(String[] args) {
        helper(4,"");
        

    }
}
