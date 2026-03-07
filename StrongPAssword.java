import java.util.Scanner;

public class StrongPAssword {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        boolean Upper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        if (pass.length() < 8) {
            System.out.println("Weak Password");
            return;
        }

        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);

            if (Character.isUpperCase(ch))
                Upper = true;
            else if (Character.isLowerCase(ch))
                hasLower = true;
            else if (Character.isDigit(ch))
                hasDigit = true;
            else
                hasSpecial = true;
        }

        if (Upper && hasLower && hasDigit && hasSpecial)
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}