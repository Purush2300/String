public class Sub2 {
    static void check(String a,String b){
       int  c = b.length();
        for (int i = 0; i <=a.length()-c; i++) {
            String t="";
            for (int j = i; j <c+i; j++) {
                t=t+a.charAt(j);
            }
            if(b.equals(t)){
                System.out.println("true");
                return;
            }
            
    }
     System.out.println("false");
}
    public static void main(String[] args) {
        String a="mississippi";
        String b="issi";
        check(a,b);
    }
}
