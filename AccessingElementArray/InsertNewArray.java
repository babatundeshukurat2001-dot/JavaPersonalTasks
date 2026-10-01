import java.util.Arrays;

    public class InsertNewArray{

    public static void main(String[] args){

int number[] = new int[]{2, 3, 4};

        int[] insert= new int[number.length + 1];

        insert[0] = 1;

        for (int count = 0; count < number.length; count++) {

            insert[count + 1] = number[count];
        }
        System.out.println(Arrays.toString(insert));





}
}
