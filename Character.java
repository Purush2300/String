public class Character {
    static void character(String a,char c){
        for (int i = 0; i <a.length(); i++) {
            char ch=a.charAt(i);
            if(ch==c){
                System.out.println(i);
                return;
            }
            else{
                System.out.println(-1);
                return;
            }

        }
    }
    public static void main(String[] args) {
        String a="Matrix";
        char c='p';
        character(a,c);
    }
}
