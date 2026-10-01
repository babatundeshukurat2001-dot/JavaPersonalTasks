import java.util.Arrays;

    public class MatchingArray{

    public static void main(String[] args){

     int[] x = {1, 2, 3, 4};

        int[] y = {10, 20, 30, 40};

        int[] sums = new int[x.length];

        for (int count = 0; count < x.length; count++) {

            sums[count] = x[count] + y[count];
        }
        System.out.println(Arrays.toString(sums));
}
}
