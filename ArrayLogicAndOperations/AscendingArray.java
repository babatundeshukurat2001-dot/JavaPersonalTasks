import java.util.Arrays;

    public class AscendingArray{

    public static void main(String[] args){

int[] number = {5, -3, 8, 2, -7, 8, 10, 1};
     
       int[] asc = Arrays.copyOf(number, number.length);

        Arrays.sort(asc);

        System.out.println(Arrays.toString(asc));


}

}
