/*write a program to find smallest integer value for a given value of a. if we multiply
 * the digits of b, we should get exact value of a
 */

import java.util.Stack;

public class Smallest_integer {
    public static void main(String[] args) {
        System.out.println((valueofB(100)));
    }

    public static int valueofB(int a) {
        Stack<Integer> q = new Stack<>();
        for (int i = 9; i >= 2; i--) {
            while (a % i == 0) {
                q.push(i);
                a = a / i;
            }
        }
        if (a != 1) {
            return -1;
        }
        int b = 0;
        while (!q.isEmpty()) {
            b = b * 10 + q.pop();
        }
        return b;

    }
}
