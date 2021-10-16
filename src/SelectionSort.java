import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2, 1, 78, 65, 34, 99, 22, 90};
        System.out.println(Arrays.toString(selectionSort(array)));
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // замена
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array;
    }
}