import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] array = {2, 4, 8, 150, -160};

        System.out.println("Наш массив " + Arrays.toString(array));
        System.out.print("Перевернутый массив: ");

        int[] array2 = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            array2[array.length - i - 1] = array[i];
            System.out.print(array2[array.length - i - 1] + " ");
        }

    }
}
