public class Reverse {
    static String reverse(String s){
          String a="";
        for (int i = s.length()-1; i >=0; i--) {
            a=a+s.charAt(i);
          
        }
        return a;
    }

    static boolean palindrom(String q){
        if(q.equals(reverse(q))){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String name="malayala";
    
      System.out.println(palindrom(name));    
    }
}
