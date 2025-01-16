public class Main {

    /* Implement your solution inside this method. */
    public static String[] handle(int n) {
        String[] result = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - 1] = "Buzz";
            } else {
                result[i - 1] = String.valueOf(i);
            }
        }
        return result;
    }

    /*
     * *****************************************************************************
     * DO NOT EDIT THIS CODE.
     * *****************************************************************************
     * 
     * This code is used to bootstrap your solution to be checked for correctness by
     * our system.
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0].trim());
        String[] result = handle(n);
        System.out.println("[\"" + String.join("\", \"", result) + "\"]");
    }
}
