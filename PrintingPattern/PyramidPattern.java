public class PyramidPattern {

    public static void main(String[] args) {

int number = 5;

        for (int count = 1; count <= number; count++) {

            for (int index = 0; index < count; index++) System.out.print(count + " ");

            System.out.println();
        }

    }
}
