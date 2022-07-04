package exemplo14collections.exercicioExtra;

import java.util.ArrayList;
import java.util.Collections;
/*a. Continuando o exercício “Collections 2”
        b. Imprimir os valores em ordem decrescente
        c. Imprimir o maior e o menor valor
        Resultado Esperado
        [300000001, 23567, 92, 88, 45, 12, 7, 3, 0, -1, -9]*/
public class quarto{
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
        Collections.reverse(vetorNum);
        for (Integer integer : vetorNum) {
            System.out.print(integer+" ");
        }
        Integer menorNum = vetorNum.get(vetorNum.size()-1);
        Integer maiorNum = vetorNum.get(0);
        System.out.println("\nMaior numero:"+maiorNum+" e "+"Menor numero: "+menorNum);
    }
}
