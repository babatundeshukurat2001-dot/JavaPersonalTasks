import java.util.Arrays;

    public class SumRowArray{

    public static void main(String[] args){


    int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

    for (int count = 0; count < array.length; count++) {

            int rowSum = 0;

            for (int index = 0; index < array[count].length; index++) rowSum += array[count][index];

            System.out.println("Row " + count+ ": " + rowSum);
        }

}
}
