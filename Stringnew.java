import java.util.StringTokenizer;
public class Stringnew {
    public static void main(String[] args) {
        StringTokenizer s= new StringTokenizer("java python sql oops"," ");
        while (s.hasMoreTokens()==true) {
            System.out.println(s.nextToken());
            
        }
    }
}
