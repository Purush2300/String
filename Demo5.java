public class Demo5 {
    static char [] TocharArray(String s){
        char [] a=new char[s.length()];
        for (int i = 0; i < a.length; i++) {
            a[i]=s.charAt(i);
        }
        return a;
    }
    public static void main(String[] args) {
        String s="JAVA";
       System.out.println( TocharArray(s));
      
    }
}
