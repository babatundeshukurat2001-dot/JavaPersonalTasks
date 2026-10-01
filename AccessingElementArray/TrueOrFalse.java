public class TrueOrFalse {

    public static void main(String[] args) {
        int[] number = new int[]{3, 6, 9, 12};

        System.out.println(contains(number, 9));
        System.out.println(contains(number, 10));
    }

    public static boolean contains(int[] array, int target) {

        for (int value : array) {

            if (value == target) {


                return true;
            }
        }
        return false;
    }
}
