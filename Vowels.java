public class Vowels {
    static String Count(String a){
          int x=0;
          String t="";
        for (int i = 0; i < a.length(); i++) {
            char c=a.charAt(i);
          
            if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u'
            ||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
               
            }
          else{
              t=t+c;
          }
        }

       return t;
    }
    public static void main(String[] args) {
        String a="CODING";
String k=Count(a);
System.out.println(k);
    }
}
