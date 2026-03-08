public class Demo3 {
    static void trim(String s){
        int si=0;
        int ei=0;
        String t="";
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)!=' '){
                si=i;
                break;
            }
        }
        for (int i = s.length()-1; i>=0; i--) {
            if(s.charAt(i)!=' '){
            ei=i;
            break;
            }
        }
        for (int i = si; i <=ei; i++) {
            t=t+s.charAt(i);
        }
        System.out.println(t);
    }
    public static void main(String[] args) {
        String s="   java          ";
        trim(s);
    }
}
