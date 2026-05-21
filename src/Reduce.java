public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;

        while (n > 0) {
            count += 1;
            boolean isEven = n % 2 == 0;
            boolean isOdd = n % 2 != 0;

            if (isEven) {
                n = n/2;
            }
            else {
                n -= 1;
            }
        }
        System.out.println(count);
    }
}
