import java.util.Arrays;

    public class LargestNumber{

    public static void main(String[] args){

int[] number = {5, -3, 8, 2, -7, 8, 10, 1};
     
       int largest = number[0];

        for (int count : number) if (count > largest) largest = count;

        System.out.println(largest);




}

}
