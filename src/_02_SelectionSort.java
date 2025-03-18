import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 2, 10};
        arr = ordernacaoPorSelecao(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] ordernacaoPorSelecao(int[] arr) {
        //List<Integer> novoArr = new ArrayList<>();
        int[] novoArr = new int[arr.length];
        int menor;
        int tamanhoArr = arr.length;

        for (int i = 0; i < tamanhoArr; i++) {
            menor = buscaMenor(arr);
            novoArr[i] = arr[menor];
            arr = pop(arr, menor);
        }

        return novoArr;
    }

    public static int buscaMenor(int[] arr) {
        int menor = arr[0];
        int menor_indice = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < menor) {
                menor = arr[i];
                menor_indice = i;
            }
        }
        return menor_indice;
    }

    public static int[] pop(int[] arr, int indice) {
        int[] novoArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != indice) novoArr[j++] = arr[i];
        }

        return novoArr;
    }
}
