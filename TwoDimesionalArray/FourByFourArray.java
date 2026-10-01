import java.util.Arrays;

    public class FourByFourArray{

    public static void main(String[] args){

int[][] number = new int[4][4]; 

        number[0][0] = 1;
        number[0][3] = 1;
        number[3][0] = 1;
        number[3][3] = 1;

        for (int[] row : number) {

            System.out.println(Arrays.toString(row));
        }




}
}

