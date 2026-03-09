public class Demo8 {
    static boolean endswith(String a,String b){
        int c=0;
        for (int i = a.length() - b.length(); i <a.length(); i++) {
           if(a.charAt(i)==b.charAt(c)){
            c++;
          
           } 
        }
       if(b.length()==c){
          return true;
       }else{
        return false;
       }
    
       
    }
    public static void main(String[] args) {
        String a="purush";
        String b="ush";
       System.out.println( endswith(a,b));
    }
}
