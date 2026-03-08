public class Demo {
    static void toUpperCase(String s){
        String t="";
        for (int i = 0; i < s.length(); i++) {
            char k=s.charAt(i);
            if(k>='a' && k<='z'){
                t=t+(char)(k-32);
            }
            else{
                t=t+k;
            }
            
        }
        System.out.println(t);
    }
    public static void main(String[] args) {
        String s="PuruShothAm";
        toUpperCase(s);
    }
}
