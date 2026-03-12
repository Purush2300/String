public class TwoString {
    static boolean twostring(String a,String b){
      int i=0;
      int j=0;
      while(i<a.length() && j<a.length()){
        if(b.charAt(i)==a.charAt(i)){
            j++;
            i++;
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
