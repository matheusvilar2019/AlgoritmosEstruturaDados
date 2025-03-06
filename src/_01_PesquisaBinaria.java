public class _01_PesquisaBinaria {
    public static void main(String[] args) {
        int[] lista = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int item = 9;
        int resultado = busca(lista, item);

        System.out.println(resultado == -1 ? "Não encontrado" : "lista[" + resultado + "] = " + lista[resultado]);
    }

    public static int busca(int[] lista, int item) {
        int baixo = 0;
        int alto = lista.length - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = lista[meio];

            if (chute == item) return meio;
            else if (chute > item ) alto = meio - 1;
            else baixo = meio + 1;
        }
        return -1;
    }
}
