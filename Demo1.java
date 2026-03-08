public class Demo1 {
    static void Indexof(String a,char s){
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)==s){
                System.out.println(i);
                return;
            }
        }
        System.out.println("not found");
    }
    public static void main(String[] args) {
        String s="jingle";
        char c='a';
        Indexof(s,c);
    }
}
