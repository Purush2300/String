public class Demo {
    static void toUpperCase(String s){
        String t="";
        for (int i = 0; i < s.length(); i++) {
            t=t+(char)(s.charAt(i)+32);
        }
        System.out.println(t);
    }
    public static void main(String[] args) {
        String s="PURUSHOTHAMREDDY";
        toUpperCase(s);
    }
}
