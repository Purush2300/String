public class UpperLower {
    static void upperlower(String a){
        String upp="";
        String low="";
        String Both="";
        for (int i = 0; i <a.length(); i++) {
            char c=a.charAt(i);
            if(c>='A' &&c<='Z'){
                upp=upp+c;
            }
            else if(c>='a'&&c<='z'){
               low+=c;
            }
            if((!(c>='a' && c<='z') ||(c>='A' && c<='Z'))||(c>='0' && c<='9') )
            {
             
           }
        }
        System.out.println(upp+low);
    }
    public static void main(String[] args) {
        String s="Hello$5WorlD";
        upperlower(s);
    }
}
