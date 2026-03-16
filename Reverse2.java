public class Reverse2 {
    static boolean palindrom(String a){
        int i=0;
        int j=a.length()-1;
        while(i<j){
            if(a.charAt(i)!=a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static void ispalidrom(String a){
        String t="";
        for (int i = 0; i <a.length(); i++) {
            if((a.charAt(i)>='A' && a.charAt(i)<='Z')){
                t=t+(char)(a.charAt(i)+32);
              
            }
            else if((a.charAt(i)==' ')){

            }
            else if((a.charAt(i)>='A' && a.charAt(i)<='Z')|| (a.charAt(i)>='a' && a.charAt(i)<='z')||(a.charAt(i)>='0' && a.charAt(i)<='9')){
              t=t+a.charAt(i);
            }
        }
          System.out.print(palindrom(t));
    }
    public static void main(String[] args) {
        String a="A man, a plan, a canal: Panama";
        ispalidrom(a);
       
    }
}
