public class Palindrom2 {
    static boolean ispalidroma(String a) {
        int i=0;
        int j=a.length()-1;
        while(i<j){
            if(a.charAt(i)!=a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String a="abca";
      System.out.println(  ispalidroma(a));
    }
}
