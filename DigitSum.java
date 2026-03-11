public class DigitSum {
    static void digit(String a){
        String str="";
        int n=0;
        for (int i = 0; i < a.length(); i++) {
            char c=a.charAt(i);
            System.out.println(c+" "+i);
            if(c>='A'&&c<='Z' || c>='a'&&c<='z'){
                str+=c;
            }
             else if(c>='0'&&c<='9'){
                n=n+c-48;
                System.out.println(n);
            }
            
        }
        System.out.println(str+n);
    }
    public static void main(String[] args) {
        String a="H2el4l8o@#";
        digit(a);
    }
}
