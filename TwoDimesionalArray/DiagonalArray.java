import java.util.Arrays;

    public class DiagonalArray{

    public static void main(String[] args){


    int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

   for (int count = 0; count < array.length; count++) {

            System.out.print(array[count][count] + " ");
        }
        System.out.println();

}
}
