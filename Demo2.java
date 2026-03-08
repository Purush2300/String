public class Demo2 {
    static void LastIndex(String s,char c){
        for (int i = s.length()-1; i >=0; i--) {
            if(s.charAt(i)==c){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
    public static void main(String[] args) {
        String s="tapacademy";
        char c='a';
        LastIndex(s,c);
    }
}
