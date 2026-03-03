public class First {
    public static void main(String[] args) {
        String n="JAVA";
        String p="Python";
        String s1=n+p;
        String s2=n+p;
        if(s1==s2){
            System.out.println("reference are equal");
        }
        else{
            System.out.println("reference are not equal");
        }
        if(s1.equals(s2)){
            System.out.println("values are equal");
        }
        else{
            System.out.println("values are not equal");
        }
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
