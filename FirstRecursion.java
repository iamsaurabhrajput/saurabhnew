public class FirstRecursion {
  static int count=0;
    static void Rec(){

        if( count ==3){
            return;
        }
        System.out.println(count);
       count= count+1;
       Rec();
    }
    public static void main(String[] args) {
        Rec();
    }
}
