public class _03_FuncaoRecursiva {
    public static void main(String[] Args) {
        int[] arr = {2, 4, 6};
        int valorSoma = soma(arr, 0, 0);
        int maiorValor = maior(arr, 0, 0);

        System.out.println(valorSoma);
        System.out.println(maiorValor);
    }

    public static int soma(int[] arr, int index, int soma) {
        if (index == arr.length) return soma;
        return soma(arr, index + 1, soma + arr[index]);
    }

    public static int maior(int[] arr, int index, int maiorValor) {
        if (index == arr.length) return maiorValor;
        return maior(arr, index + 1 ,Math.max(arr[index], maiorValor));
    }
}
