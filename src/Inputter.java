import java.util.Scanner;

public class Inputter {

    protected static int a;
    protected static int b;

    public static void inputting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer A");
        a = scanner.nextInt();
        System.out.println("Input integer B");
        b = scanner.nextInt();
        scanner.close();
    }

}
