public class Demo6 {
    static boolean equals(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for (int i = 0; i <s1.length(); i++) {
            if(s1.charAt(i)==s2.charAt(i)){
                return true;
            }
          
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="JAVA";
        String s2="JAVA";
        equals(s1,s2);
    }
}
