import java.util.Arrays;

    public class DescendingArray{

    public static void main(String[] args){

int[] number = {5, -3, 8, 2, -7, 8, 10, 1};
     
      int[] desc = new int[asc.length];

        for (int count = 0; count < asc.length; count++) {

            desc[count] = asc[asc.length - 1 - count];
        }
        System.out.println(Arrays.toString(desc));

}

}
