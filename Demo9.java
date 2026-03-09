public class Demo9 {
    static boolean contains(String a,String b){
        int c=0;
        for (int i =0; i < a.length() && c<b.length(); i++) {
            if(a.charAt(i)==b.charAt(c)){
                c++;
            }
            else{
                c=0;
            }
        }
            if(b.length()==c){
                return true;
            }
            else{
                return false;
            }
        
    }
    public static void main(String[] args) {
        String a="purush";
        String b="ru";
       System.out.println( contains(a,b));
    }
}
