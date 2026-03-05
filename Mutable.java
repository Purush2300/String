public class Mutable {
    public static void main(String[] args) {
        StringBuffer s= new StringBuffer();
        s.append("purush");
        System.out.println(s.capacity());

        System.out.println(s);
        System.out.println(s.length());
        s.append("    shotham");
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.capacity());
       s.trimToSize();
       System.out.println(s.capacity());
    }
}
