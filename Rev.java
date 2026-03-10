import java.util.*;
public class Rev {
    static String Reverseof(String a){
        String t="";
        for (int i = a.length()-1; i>=0; i--) {
            t=t+a.charAt(i);
        }
        return t;
    }
    static String palindrom(String a){
        if(a.equals(Reverseof(a))){
            return "true";
        }
        return "false";
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a=scan.next();
      
       System.out.print( palindrom(a));
    }
}
