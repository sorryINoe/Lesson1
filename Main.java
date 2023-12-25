import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        System.out.printf("Enter user name" + "\n") ;

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        System.out.printf("Hello " + username);

    }
}