import java.util.*;

public class CalculatorHistory {

    static ArrayList<String> history = new ArrayList<>();

    public static double calc(double a, char op, double b) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter expr (a op b) or 'history' or 'exit': ");
            String input = sc.nextLine();

            if (input.equals("exit")) break;
            if (input.equals("history")) {
                for (String h : history) System.out.println(h);
                continue;
            }

            String[] p = input.split(" ");
            double a = Double.parseDouble(p[0]);
            char op = p[1].charAt(0);
            double b = Double.parseDouble(p[2]);

            double result = calc(a, op, b);
            history.add(input + " = " + result);

            System.out.println("Result: " + result);
        }
    }
}
