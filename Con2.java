public class Con2 {
    static int Consonents(String a){
        int q=0;
        for (int i = 0; i <a.length(); i++) {
            char c=a.charAt(i);
            if((c>='a' && c<='z') ||(c>='A' && c<='Z'))
            {
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
                c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){

              q++;
            }
             else{
              
            }
        }
           
        }
        return q;
    }
    public static void main(String[] args) {
        String a="theOne@123";
        System.out.println(Consonents(a));
    }
}
