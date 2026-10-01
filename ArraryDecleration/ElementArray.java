import java.util.Arrays;

    public class ElementArray{

    public static void main(String[] args){

int[] original = {10, 12, 13, 14, 15};

        int[] copy = Arrays.copyOf(original, original.length); 

        System.out.println("Original: " + Arrays.toString(original));

        System.out.println("Copy:     " + Arrays.toString(copy));





}

}
