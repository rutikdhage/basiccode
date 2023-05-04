public class sumofnatural {
    public static void main(String args[]) {
        int n = 5;
        int val = 1, sum = 0;
        while (val <= n) {
            sum = sum + val;
            val = val + 1;

        }
        System.out.println(sum);
    }

}
