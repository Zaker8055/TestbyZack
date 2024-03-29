package Sample;
public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int[] ways = new int[n + 1];
        ways[1] = 1;
        ways[2] = 2;

        for (int i = 3; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }

        return ways[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int result = climbStairs(n);
        System.out.println("There are " + result + " distinct ways to climb " + n + " steps.");
    }
}
