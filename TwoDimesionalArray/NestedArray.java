import java.util.Arrays;

    public class NestedArray{

    public static void main(String[] args){


    int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

    for (int count = 0; count < array.length; count++) {

            for (int index = 0; index < array[count].length; index++) {

                System.out.print(array[count][index] + " ");
            }
        }
        System.out.println();


}
}
