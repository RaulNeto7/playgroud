package exemplo14collections.exercicioExtra;

import java.util.ArrayList;
import java.util.Collections;

public class segundo {
    /*
        a. Considerando os seguintes valores {88, 7, 0, -1, 45, 3, 92, -9, 300000001,12,
            23567}
        b. Imprima os valores em ordem crescente (Considerar as diferentes
                características das implementações)
        c. Verificar se o valor é Positivo, Negativo ou Zero imprimindo o resultado
        Resultado esperado:
                [-9, -1, 0, 3, 7, 12, 45, 88, 92, 23567, 300000001]
                -9 - Negativo
    -1 - Negativo
    0 - Zero
    3 - Positivo
    7 - Positivo
    12 - Positivo
    45 - Positivo
    88 - Positivo
    92 - Positivo
    23567 - Positivo
    300000001 – Positivo
    */
    public static void main(String[] args) {
        ArrayList<Integer> vetorNum = new ArrayList<>();
        vetorNum.add(88);
        vetorNum.add(7);
        vetorNum.add(0);
        vetorNum.add(-1);
        vetorNum.add(45);
        vetorNum.add(3);
        vetorNum.add(92);
        vetorNum.add(-9);
        vetorNum.add(300000001);
        vetorNum.add(12);
        vetorNum.add(23567);
        Collections.sort(vetorNum);
        for (Integer integer : vetorNum) {
            System.out.print(integer + " ");
        }
        System.out.println("\n");
        verificarNegZeroPos(vetorNum);
    }

    public static void verificarNegZeroPos(ArrayList<Integer> x) {
        for (Integer integer : x) {
            if (integer > 0) {
                System.out.println(integer + " - Positivo");
            } else if (integer < 0) {
                System.out.println(integer + " - Negativo");
            }else {
                System.out.println(integer + " - Zero");
            }
        }
    }
}
