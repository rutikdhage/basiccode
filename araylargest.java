public class araylargest {
    public static int larnum(int num[]) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (large < num[i]) {
                large = num[i];
            }
        }
        return large;
    }

    public static void main(String args[]) {
        int num[] = { 5, 6, 4, 7, 8, 1, 3, 9, 6, 2 };

        System.out.println("lagest num  " + larnum(num));
    }

}
