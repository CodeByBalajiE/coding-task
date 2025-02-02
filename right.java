public class right {
    public static void main(String[] args) {
        for (int j = 1; j <= 13; j += 2) {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();


        }
        for (int k = 11; k >= 1; k -= 2) {
            for (int i = 1; i <= k; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
