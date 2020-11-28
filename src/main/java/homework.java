import java.util.Arrays;

public class homework {




    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        findMinMax();

    }

       private static void invertArray() {

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++); {
               int i = 0;
               array[i] = (array[i] == 0) ? 1 : 0;   }

        System.out.println(Arrays.toString(array));
    }

    public static void fillArray () {
        int[] arr = new int [8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));

    }
    private static void changeArray () {
        int[] array = {1, 5, 3, 2, 11, 4, 8, 9, 1};
        for (int i = 0; i <array.length; i++) {
            int value = array[i];
            if (value < 6); {
                array[i] = value * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }
public static void fillDiagonal () {
            int[][] arr = new int[3][3];
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {

        }
            }
    System.out.println(Arrays.toString(arr));
}
public static void findMinMax() {
        int [] array = {1, 7, 5, 8, 6, 3, 9};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) ;
            {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

    System.out.println("Min = " + min);
    System.out.println("Max = " + max);
}

}
