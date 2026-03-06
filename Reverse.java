public class Reverse {
    public static void main(String[] args) {
        String name="JAVA";
        String a="";
        for (int i = name.length()-1; i >=0; i--) {
            a=a+name.charAt(i);
          
        }
          System.out.println(a);
    }
}
