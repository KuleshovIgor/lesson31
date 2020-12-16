public class DimArray {
    public static void main(String[] args) {
        int[][] dimArray = new int[7][5];
        int[][] dimArrayTwo = new int[5][7];

        System.out.println("Как было!");

       for (int i = 0; i < dimArray.length; i++) {
            for (int j = 0; j < dimArray[0].length; j++) {
                dimArray[i][j] = 1;
            }
        }


        for (int i = 0; i < dimArray.length; i++) {
            for (int j = 0; j < dimArray[0].length; j++) {
                System.out.print(" " + dimArray[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println();
        for (int i = 0; i < dimArrayTwo.length; i++) {
            for (int j = 0; j < dimArrayTwo[0].length; j++) {
                dimArrayTwo[i][j] = 2;
            }
        }

        for (int i = 0; i < dimArrayTwo.length; i++) {
            for (int j = 0; j < dimArrayTwo[0].length; j++) {
                System.out.print(" " + dimArrayTwo[i][j] + " ");
            }
            System.out.println();
        }




        int[][] dimArrayThree = new int[dimArray.length][dimArrayTwo[0].length];
        for (int i = 0; i < dimArrayThree[0].length; i++) {
            for (int j = 0; j < dimArrayThree.length; j++) {
                for (int k = 0; k < dimArray[0].length; k++) {
                    dimArrayThree[i][j] = dimArrayThree[i][j] + dimArray[i][k] * dimArrayTwo[k][j];
                }
            }
        }
        System.out.println("Как стало!");
        for (int i = 0; i < dimArrayThree.length; i++) {
            for (int j = 0; j < dimArrayThree[0].length; j++) {
                System.out.print(" " + dimArrayThree[i][j] + " ");
            }
            System.out.println();
        }
    }
}
