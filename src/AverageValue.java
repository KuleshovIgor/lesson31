import java.util.Arrays;

public class AverageValue {
    public static void main(String[] args) {


        int[] array = {2, 4, 8, 150, -160};

        int averageValue = 0;

        for (int i = 0; i < array.length; i++) {
            averageValue += array[i];
        }
        System.out.println("Наш массив " + Arrays.toString(array));
        System.out.println("Среднее значение массива: " + averageValue / 2);
    }
}
