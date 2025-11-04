public class problem {
    static int helper(String s, char ch, int in){
        if ( in==s.length()){
            return 0 ;
        }
        int count = helper(s , ch , in+1);
        if(s.charAt(in) == ch){
            count++;
        }
        return count ;
    }
    public static void main(String[] args) {
        String s= "shfhtuvslorbvdsf";
        char ch = 's';
        int result = helper(s,ch,0);
        System.out.println(result);
    }
}
