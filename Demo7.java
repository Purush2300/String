public class Demo7 {
    static boolean startwith(String a,String b){
        int c=0;
        for (int i = 0; i < b.length(); i++) {
            if(a.charAt(i)==b.charAt(c)){
                c++;
                return true;
            }
            else{
                break;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String a="tapacademy";
        String b="app";
        System.out.println(startwith(a,b));
    }
}
