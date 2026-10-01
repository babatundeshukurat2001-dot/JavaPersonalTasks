import java.util.Arrays;

    public class DescendingArray{

    public static void main(String[] args){

int[] number = {5, -3, 8, 2, -7, 8, 10, 1};
     
       int[] desc = Arrays.copyOf(number, number.length);

        Arrays.sort(desc);

        System.out.println(Arrays.toString(desc));


}

}
