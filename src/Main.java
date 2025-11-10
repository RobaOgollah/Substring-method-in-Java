import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Substrings -
        Scanner scanner = new Scanner(System.in);
        String email = "ogollahroba@gmail.com";
        System.out.print("Enter user email: ");
        email = scanner.nextLine().toLowerCase();

        if (email.contains("@")) {
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);

        } else {
            System.out.println("Emails MUST contain @");
        }
        scanner.close();
    }

}