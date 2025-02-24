package two_sum;

public class TwoSum {
    public static void main(String[] args) {
        /*
        Given an array of intergers, return indices of the two numbers such taht they add up to a specific target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice

        Example:
        Given nums = [2, 7, 11, 15], target = 9
        Because nums[0] + nums[1] = 2 + 7 = 9
        return [0, 1]
        */
        int target = 9;
        int[] lista = {2, 7, 11, 15};
        imprimir(lista, target);
    }

    private static int[] somadoresParaTarget(int[] lista, int target) {
        for (int i = 0; i < lista.length; i++) {
            for (int i1 = 0; i1 < lista.length; i1++) {
                if (lista[i] + lista[i1] == target) {
                    int[] doisNumeros = {lista[i], lista[i1]};
                    return doisNumeros;
                }
            }
        }
        return null;
    }

    private static void imprimir(int[] lista, int target) {
        int[] listaFinal = somadoresParaTarget(lista, target);
        System.out.printf("[%d, %d]", listaFinal[0], listaFinal[1]);
    }
}
