import java.util.*;

public class bracketsValidator {

    public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> pairs = Map.of(')', '(', ']', '[', '}', '{');

        for (char ch : s.toCharArray()) {
            if (pairs.containsValue(ch)) {
                st.push(ch);
            } else if (pairs.containsKey(ch)) {
                if (st.isEmpty() || st.pop() != pairs.get(ch)) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string of brackets:");
        String input = sc.nextLine();

        System.out.println(isBalanced(input));
    }
}
