import javax.swing.text.Position;

/*he wanted to know the final position of a person,who starts from the origin 0 0
and travels per following scheme.He first turns and travels 10 units of distance
His second turn is upward for 20 units Third turn is to the left for 30 units Fourth 
turn is the downward for 40 units Fifth turn is to the right(again)for 50 units…And 
thus he travels,every time increasing the travel distance by 10 units*/

// Input : 3
// Expected Output :-20 20
// Input: 4
// Expected Output: -20 -20
// Input : 5
// Expected Output : 30 -20
// Input : 7
// Expected Output : 90 -20
import java.util.ArrayDeque;

public class Nine_gems {
    public static void main(String[] args) {
        position(0); // calling the position method
    }

    public static void position(int n) {
        int x = 0;
        int y = 0;
        int d = 10;
        ArrayDeque<Character> adq = new ArrayDeque<>();
        adq.offer('R');
        adq.offer('U');
        adq.offer('L');
        adq.offer('D');
        for (int i = 1; i <= n; i++) {
            char k = adq.poll(); // pulling out the first element in the queue
            if (k == 'R') {
                x = x + (d * i);
            } else if (k == 'U') {
                y = y + (d * i);
            } else if (k == 'L') {
                x = x - (d * i);
            } else if (k == 'D') {
                y = y - (d * i);
            }
            adq.offer(k); // adding the eliment again at the end of the queue
        }
        System.out.println("X:" + x + " " + "Y:" + y);
    }
}
