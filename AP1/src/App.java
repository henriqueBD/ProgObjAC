import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        String test = scanner.nextLine();
        System.out.println(test);

        scanner.close();

    }
}
