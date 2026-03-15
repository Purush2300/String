public class Sub3 {
    static boolean ispalindrom(String a){
    int i=0;
    int j=a.length()-1;
    while(i<j){
        if(a.charAt(i)==a.charAt(j)){
           i++;
           j--;
        }
        else{
            return false;
        }

       
    }
     return true;
}
    static void sub3(String a,int b){
        for (int i = 0; i <=a.length()-b; i++) {
            String t="";
            for (int j = i; j <i+b; j++) {
                t=t+a.charAt(j);
                
            }
          if(ispalindrom(t)){
            System.out.println(t);
            return;
          }
        }
    }
    public static void main(String[] args) {
        String a="mississippi";
        
       for (int size = a.length(); size>=1; size--) {
         sub3(a,size);
       }
    }
}
