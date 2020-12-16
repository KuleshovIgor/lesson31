import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] array = {2, 4, 8, 150, -160};
        int[] arrayTwo = new int[array.length];

        System.out.println("Наш массив array " + Arrays.toString(array));
        System.out.println("Наш массив array2" + Arrays.toString(arrayTwo));

       // arrayTwo = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++){
            arrayTwo[i] = array[i];
        }


        System.out.println("Наш массив array2 после копии:" + Arrays.toString(arrayTwo));

    }
}

