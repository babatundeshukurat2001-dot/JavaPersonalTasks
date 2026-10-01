import java.util.Arrays;

    public class SumArray{

    public static void main(String[] args){


    int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

     int total = 0;

        for (int[] row : array) {

            for (int count : row) total += count;
        }
        System.out.println(total);



}
}
