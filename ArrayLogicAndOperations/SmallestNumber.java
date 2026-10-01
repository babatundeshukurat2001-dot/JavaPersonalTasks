import java.util.Arrays;

    public class SmallestNumber{

    public static void main(String[] args){

int[] number = {5, -3, 8, 2, -7, 8, 10, 1};
     
       int smallest = number[0];

        for (int count : number) if (count < smallest) smallest = count;

        System.out.println(smallest);




}

}
