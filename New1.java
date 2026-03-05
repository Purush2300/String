public class New1 {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer()
        String n="purushotham reddy";
      String a="";
      for (int i = n.length()-1; i >=0; i--) {
        a=a+n.charAt(i);
      }
      System.out.println(a);
    }
}
