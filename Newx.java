public class Newx {
    public static void main(String[] args) {
        String txt = "greeksforgeeks";
        String pat = "for";

        for (int i = 0; i <= txt.length() - pat.length(); i++) {
            int j;
            for (j = 0; j < pat.length(); j++) {
                if (txt.charAt(i +j) != pat.charAt(j)) {
                    break;
                }
            }
            if (j == pat.length()) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}