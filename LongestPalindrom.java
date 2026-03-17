public class LongestPalindrom {

    static int first(String a, String b) {
        for (int i = 0; i <= a.length() - b.length(); i++) {
            int j = 0;

            while (j < b.length() && a.charAt(i + j) == b.charAt(j)) {
                j++;
            }

            if (j == b.length()) {
                return i; // match found
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        String a = "school";
        String b = "fizz";
        System.out.println(first(a, b));
    }
}