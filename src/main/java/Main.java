public class Main {

    /* Implement your solution inside this method. */
    public static String[] handle(int n) {
        return new String[0];
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
