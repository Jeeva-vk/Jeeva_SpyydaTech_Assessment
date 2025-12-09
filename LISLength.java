import java.util.*;

public class LISLength {

    public static int lis(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int x : arr) {
            int pos = Collections.binarySearch(list, x);
            if (pos < 0) pos = -(pos + 1);

            if (pos == list.size()) list.add(x);
            else list.set(pos, x);
        }
        return list.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        String[] parts = sc.nextLine().split(" ");

        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) arr[i] = Integer.parseInt(parts[i]);

        System.out.println("LIS Length = " + lis(arr));
    }
}
