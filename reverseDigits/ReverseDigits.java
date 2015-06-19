public class ReverseDigits {
    public static int powerOfTen(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 10 * powerOfTen(n / 10);
        }
    }
    public static int reverseDigits(int n) {

        // Please write your code after this line
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) * powerOfTen(n) + reverseDigits(n / 10);
        }

    }
    public static void main(String[] args) { 
        System.out.println(reverseDigits(12345));
        System.out.println(reverseDigits(12300));
    }
}
