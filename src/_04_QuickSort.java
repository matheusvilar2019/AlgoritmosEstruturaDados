import java.util.Arrays;

public class _04_QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 3};
        int size = arr.length;

        quicksort(arr, 0, size - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static int particionamento(int arr[], int menor, int maior) {
        int pivo = arr[maior];
        int i = (menor - 1);

        for (int j = menor; j < maior; j++) {
            if (arr[j] <= pivo) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[maior];
        arr[maior] = temp;
        return (i + 1);
    }

    public static void quicksort(int[] arr, int menor, int maior) {
        if (menor < maior) {
            int pi = particionamento(arr, menor, maior);
            quicksort(arr, menor, pi - 1);
            quicksort(arr, pi + 1, maior);
        }
    }
}
