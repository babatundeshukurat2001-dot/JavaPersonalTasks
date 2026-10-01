import java.util.Arrays;

    public class LastArray{

    public static void main(String[] args){


int number [] = new int[]{1, 2, 3, 4};

        int[] remove = Arrays.copyOf(number, number.length - 1);

        System.out.println(Arrays.toString(remove));






}
}
