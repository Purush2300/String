public class Sub1 {
    static void sub1(String a,int l){
       
        for (int i = 0; i <=a.length()-l; i++) {
             String t="";
            for (int j = i; j <l+i; j++) {
               t=t+a.charAt(j);
              
            }
             System.out.println(t);
        }
    }
    public static void main(String[] args) {
        String a="ewmnffjgoirenajfkn";
        int l=4;
        sub1(a,l);
    }
}
