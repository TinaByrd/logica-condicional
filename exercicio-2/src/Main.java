public class Main {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 " + (b1&&b2)); /*false*/
        System.out.println("b1 && b3 " + (b1&&b3)); /*true*/

        System.out.println("b2 || b3 " + (b2||b3));/*true*/
        System.out.println("b2 || b4 " + (b2||b4)); /*false*/

        System.out.println("b1 ^ b3 " + (b1^b3)); /*false*/
        System.out.println("b4 ^ b1 " + (b4^b1));/*true*/

        System.out.println(!b1); /*false*/
        System.out.println(!b2); /*true*/
    }
}