public class Mutable1 {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("JAVA");
        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.length());
        System.out.println(s.charAt(2));
    }
}
