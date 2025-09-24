import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array) + "\n");

        Randomize.randomizer(array);

    }
}

class Randomize {
    public static void randomizer(int[] A) {
        int n = A.length;
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            int j = i + rand.nextInt(n - i);

            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;

            System.out.println("Iteration i: " + (i+1));
            System.out.println("Random(" + (i+1) + "," + n + ") = " + (j+1));
            System.out.println(Arrays.toString(A));
            System.out.println("Swapped element " + (i+1) + " with element " + (j+1) + "\n");

        }

        System.out.println("Randomized array: " + Arrays.toString(A));

    }

}