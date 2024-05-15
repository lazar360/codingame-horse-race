import java.util.*;

public class Main {


    /**
     * Auto-generated code below aims at helping you parse
     * the standard input according to the problem statement.
     **/
    class Solution {

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            Integer[] arrayPi = new Integer[N];
            for (int i = 0; i < N; i++) {
                int pi = in.nextInt();
                arrayPi[i] = pi;
            }

            // Write an answer using System.out.println()
            // To debug: System.err.println("Debug messages...");
            List<Integer> result = new ArrayList<>();
            Arrays.sort(arrayPi);
            for (int i = 1; i < arrayPi.length; i++) {
                result.add(Math.abs(arrayPi[i] - arrayPi[i - 1]));
            }
            System.out.println(Collections.min(result));
        }
    }
}
