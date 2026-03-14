public class Sub3 {
    static void sub3(String a,int b){
        for (int i = 0; i <=a.length()-b; i++) {
            String t="";
            for (int j = i; j <i+b; j++) {
                t=t+a.charAt(j);
                
            }
            System.out.println(t);
        }
    }
    public static void main(String[] args) {
        String a="hello";
        
       for (int size = 1; size <=a.length(); size++) {
         sub3(a,size);
       }
    }
}
