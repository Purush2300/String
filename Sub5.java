public class Sub5 {
    static int count(String a){
        int c=0;
        for (int i = 0; i < a.length()-1; i++) {
            if (a.charAt(i)==' ' &&a.charAt(i+1)!=' ') {
                c++;
            }
        }
        return a.charAt(0)==' '?c:c+1;
    }
    static String [] space(String a){
        int w=count(a);
       String[] ar=new String[w];
       String t="";
       int j=0;
       for (int i = 0; i < a.length(); i++) {
        if(a.charAt(i)!=' '){
            t=t+a.charAt(i);
        }
        else{
            ar[j]=t;
            j++;
            t="";
        }
       }
       ar[j]=t;
       return  ar;
    }
    public static void main(String[] args) {
        String s="how are you";
        String [] z=space(s);
        for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }
    }
}
