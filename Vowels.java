public class Vowels {
    static int Count(String a){
          int x=0;
        for (int i = 0; i < a.length(); i++) {
            char c=a.charAt(i);
          
            if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u'
            ||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                x+=1;
            }
        }

        return x;
    }
    public static void main(String[] args) {
        String a="aeiouAEIOU";
int k=Count(a);
System.out.println(k);
    }
}
