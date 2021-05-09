public class Calculator {

    public static void addition() {
        float result;
        result = Inputter.a + Inputter.b;
        System.out.println("a plus b equals");
        System.out.println(result);
    }

    public static void subtraction() {
        float result;
        result = Inputter.a - Inputter.b;
        System.out.println("a minus b equals");
        System.out.println(result);
    }

    public static void multiply() {
        float result;
        result = Inputter.a * Inputter.b;
        System.out.println("a multiply b equals");
        System.out.println(result);
    }

    public static void dividing() {
        float result;
        result = Inputter.a / Inputter.b;
        System.out.println("a divide b equals");
        System.out.println(result);
    }
}
