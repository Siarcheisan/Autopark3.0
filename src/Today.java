public class Today {
    public static void main(String[] args) {
int someNumber = 53477435;
getTrue(someNumber);
        System.out.println(getTrue(someNumber));
    }
    public static boolean getTrue (int someNumber){
        for (int i = 0; i <someNumber/2; i++) {
            for (int j = someNumber-1; j >someNumber ; j--) {
           if (j==i){
               return true;
           }
            }
            
        }    
    }
}
