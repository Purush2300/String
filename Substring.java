public class Substring {
    public static void main(String[] args) {
        String a="gitgit";
        int k=3;
        for (int i = 0; i < a.length()-k; i++) {
            for (int j = i; j<i+k; j++) {
                System.out.print(a.charAt(j));
            }
            System.out.println();
        }
    }
}
