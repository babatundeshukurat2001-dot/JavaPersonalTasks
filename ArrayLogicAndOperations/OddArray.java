import java.util.Arrays;

    public class OddArray{

    public static void main(String[] args){

int[] number = {5, -3, 8, 2, -7, 8, 10, 1};
     
       int odds = 0;

        for (int x : number) if (x % 2 != 0) odds++;

        System.out.println(odds);



}

}
