public class Sub4 {
    static void equal(String a,String b){
        int i=0;
        int j=0;
        if(a.length()!=b.length()){
System.out.println("false");
return;
        }
       while (i<a.length() && j<b.length()) {
        if(a.charAt(i)!=b.charAt(j)){
            System.out.println("false");
        }
            j++;
             i++;
}
System.out.println("true");
    }
    public static void main(String[] args) {
        String a="hello";
        String b="heooo";
        equal(a,b);
    }
}
