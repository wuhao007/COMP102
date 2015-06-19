public class ReverseDigits {
    public void arrangeStack(Stack<Integer> original) {

            // Please write your code after this line
        Stack<Integer> even;
        Stack<Integer> odd;
        while (!original.empty()) {
            int n = original.pop();
            if (n % 2 == 0) {
                even.push(n);
            } else {
                odd.push(n);
            }
        }
        while (!odd.empty()) {
            original.push(odd.pop());
        }
        while (!even.empty()) {
            original.push(even.pop());
        }
    }
    public static void main(String[] args) { 
        System.out.println(reverseDigits(12345));
        System.out.println(reverseDigits(12300));
    }
}
