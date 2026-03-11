public class UtoL {
    static void utol(String a){
        String t="";
        for (int i = 0; i <a.length(); i++) {
            char c=a.charAt(i);
            System.out.println(c+" "+i);
            if(c>='a'&&c<='z'){
                t=t+(char) (c-32);
                
            }
            else if(c>='A'&&c<='z'){
                t=t+(char)(c+32);
            }
            else{
                t=t+c;
            }
        }
        System.out.println(t);
    }
    public static void main(String[] args) {
        String a="Hello@123#";
        utol(a);
    }
}
