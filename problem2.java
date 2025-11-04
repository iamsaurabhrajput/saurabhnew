public class problem2 {
    static void removeSymbol(String s , char ch  , int i ){
        if( i == s.length()){
            return  ;
        }
        removeSymbol(s , ch , i+1);
        if(s.charAt(i) == ch){
            System.out.print(ch);
        }

    }
    public static void main(String[] args) {
        String s = "a+aa+aa*aa//aa/a+";
        char ch = 'a';
        removeSymbol(s , ch , 0);
    }
}
