public class Sub2 {
    static void check(String a,String b){
        int count=0;
       int  c = b.length();
        for (int i = 0; i <=a.length()-c; i++) {
            String t="";
      
            for (int j = i; j <c+i; j++) {
                t=t+a.charAt(j);
            }
            if(b.equals(t)){
                // count++;
                // System.out.println(count);
               
                // return;
                System.out.println("true");
                return;
            }
            
    }
     System.out.println("false");
}
    public static void main(String[] args) {
        String a="mississippi";
        String b="issi";
        check(a,b);
    }
}


// import java.util.*;
// public class Sub2 {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int [] b=new int[a];
      
//         for (int i = 0; i <a; i++) {
//            b[i]=sc.nextInt();
//         }
//         for (int i = 0; i < a; i++) {
//             System.out.println(b[i]);
//         }
//     }
// }