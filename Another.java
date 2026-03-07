public class Another {
    public static void main(String[] args) {
        String a="bcd";
        int n=10;
        int count=0;
        for (int i = 0; i <a.length(); i++) {
            if(a.charAt(i)=='a'){
                count++;
            }
        }
        long count1=n/a.length()*count;
        int count2=0;
        for (int i = 0; i < n%a.length(); i++) {
              if(a.charAt(i)=='a'){
                count2++;
            }
        }
        System.out.println(count1+count2);
    }
}
