public class PowerOfTen {
    public static int powerOfTen(int n) {

            // Please write your code after this line
        if (n < 10) {
            return 1;
        } else {
            return 10 * powerOfTen(n / 10);
        }

    }
    public static void main(String[] args) { 
        System.out.println(powerOfTen(12345));
        System.out.println(powerOfTen(789));
        System.out.println(powerOfTen(100));
        System.out.println(powerOfTen(5));
        System.out.println(powerOfTen(0));
    }
}
