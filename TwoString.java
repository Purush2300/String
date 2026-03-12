public class TwoString {
    static boolean twostring(String a,String b){
      int i=0;
      int j=0;
      while(j<b.length()){
        if(a.charAt(i)==b.charAt(i)){
            j++;
            return true;

        }
        i++;
      }
      return false;
    }
    public static void main(String[] args) {
        String a="hweoiyadfhckerrank";
        String b="hackerrank";
        System.out.println(twostring(a,b));
    }
}
