public class Words {
    static int words(String a){
        int c=0;
        for (int i = 0; i <a.length()-1; i++) {
            if(a.charAt(i)==' ' && a.charAt(i+1)!=' '){
                c++;
            }
        }
        return a.charAt(0)==' '?c:c+1;
    }
    public static void main(String[] args) {
        String a="  how       the  are   ";
       System.out.println( words(a));
    }
}
