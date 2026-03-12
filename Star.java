public class Star {
    static void star(String a){
         String t="";
   for (int i = 0; i <a.length(); i++) {
  
    if(a.charAt(i)=='a'){
        t=t+'*'+a.charAt(i);
    }
    else{
        t=t+a.charAt(i);
    }
}
System.out.println(t);
    }
   
    public static void main(String[] args) {
        String a="abanana";
        star(a);
    }
}
