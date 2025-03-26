public class Main {

 
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
        String[] result = new Solution().handle(n);
        System.out.println("[\"" + String.join("\", \"", result) + "\"]");
    }
}
