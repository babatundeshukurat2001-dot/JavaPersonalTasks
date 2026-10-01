public class UpsideTrianglePattern {

    public static void main(String[] args) {

        int rows = 5;

        for (int count = rows; count >= 1; count--) {

            for (int index = 0; index < count; index++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
