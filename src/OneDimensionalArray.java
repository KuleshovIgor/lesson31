import java.io.IOException;
import java.util.Arrays;

public class OneDimensionalArray {
    public static void main(String[] args) {
        int[] array = {2, 4, 8, 150, -160};
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
            }
        }
        System.out.println("Наш массив " + Arrays.toString(array));
        System.out.println("Максимальное число массива: " + max);
    }
}
