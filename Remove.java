public class Remove {
    static void remove(String a){
        int si=0;
        int ei=0;
        String t="";
        
        for (int j2 = 0; j2 <a.length(); j2++) {
            if(a.charAt(j2)!=' '){
                si=j2;
                break;
            }
        }
        for (int i = a.length()-1; i>=0; i--) {
            if(a.charAt(i)!=' '){
                ei=i;
                break;
            }
        }
        for (int i = si; i <=ei; i++) {
            if(a.charAt(i)!=' ' ||(a.charAt(i)==' ' &&a.charAt(i+1)!=' ')){
                t=t+a.charAt(i);
            }
        }
        System.out.println(t);
    }
    public static void main(String[] args) {
        String a="   ja a ag        d   ";
        remove(a);
    }
}
