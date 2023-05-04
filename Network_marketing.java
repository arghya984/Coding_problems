/*In network marketing a person who sells some merchandise becomes the root of the so called
 * network makrketin tree. When the first person inducts someone into the network marketing tree
 * the first person becomes the supervisor. Likewise if the new recruit inducts a third person into the 
 * network marketing tree the new recruit becomes the supervisor of the third person an so on...
 * 
 * whenever anybody in the the tree makes profit, they have to pass a certain percentage of that profit to their supervisor.
 * the percentage of the profit passed to the supervisor will be rounded to the nearest integer, and hence will always be an integer at each level.
 * calculate the profit of th person at the root of the tree coming from a particular indvidual at Nth level in the tree...
 * 
 * Inputs:
 * N: level of the tree
 * P: percentage
 * M= profit earned by Nth member
 * Output: profit earned by the person at the root of the tree rounded of to nearest integer
 * Example: N=3; M=100; P=10;
 * Output=1;
 *       
 */
public class Network_marketing {
    public static void main(String[] args) {
        System.out.println(rootprofit(2, 10, 154888));
    }

    public static int rootprofit(int N, int P, int M) {
        int m = M;
        for (int i = 1; i < N; i++) {
            double commision = m * P / 100;
            m = (int) Math.round(commision);
        }
        return m;
    }
}