import java.util.Arrays;

    public class EvenArray{

    public static void main(String[] args){

int[] number = {5, -3, 8, 2, -7, 8, 10, 1};
     
       int evens = 0;

        for (int x : number) if (x % 2 == 0) evens++;

        System.out.println(evens);



}

}
