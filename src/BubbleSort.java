import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 1, 78, 65, 34, 99, 22, 90};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    /*Алгоритм просматривает массив и сравнивает каждую пару соседних элементов.
    Когда он встречает пару элементов, расположенных не по порядку,
    происходит замена двух элементов местами.*/

    public static int[] bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }
}