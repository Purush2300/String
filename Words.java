public class Words {
    static int words(String a){
        int c=0;
        for (int i = 0; i <a.length(); i++) {
            if(a.charAt(i)==' '){
                c++;
            }
        }
        return c+1;
    }
    public static void main(String[] args) {
        String a="how are";
       System.out.println( words(a));
    }
}
