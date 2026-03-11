public class Special {
    static void special(String a){
      String  t="";
      for (int i = 0; i <a.length(); i++) {
        char c=a.charAt(i);
         if((c>='a' && c<='z') ||(c>='A' && c<='Z')||(c>='0' && c<='9') )
            {
              t=t+c;
        }

      
    }
    System.out.println(t);
}
    public static void main(String[] args) {
        String s="India@123#";
        special(s);
    }
}
