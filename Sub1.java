public class Sub1 {

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



    static void sub1(String a,int l){
       
        for (int i = 0; i <=a.length()-l; i++) {
             String t="";
            for (int j = i; j <l+i; j++) {
               t=t+a.charAt(j);
              
            }
             if(ispalindrom(t)){
                System.out.println(t);
             }
        }
    }
    public static void main(String[] args) {
        String a="mississippi";
        int l=4;
        sub1(a,l);
    }
}
