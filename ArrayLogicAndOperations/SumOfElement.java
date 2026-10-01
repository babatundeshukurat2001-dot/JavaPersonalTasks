import java.util.Arrays;

    public class SumOfElement{

    public static void main(String[] args){

    int[] number = {5, -3, 8, 2, -7, 8, 10, 1};

        System.out.println("Sample array: " + Arrays.toString(number));

     
        int total = 0;

        for (int count : number) total += count;

        System.out.println(total);





}

}
