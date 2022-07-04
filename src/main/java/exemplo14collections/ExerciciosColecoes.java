package exemplo14collections;
import java.util.*;
import java.util.TreeSet;

/*
- Crie uma coleção de Strings vazia chamada `pessoas`.
- Adicione os nomes: Bryana, Kiersten, Zaneta, Frank, Bryana, Tedi, C, Devan, Jerrilyn, Isac, Kathrine.
- Imprima a lista completa.
- Crie uma nova coleção de Strings chamada `primeiros`.
    - Nesta nova lista, não pode haver repetição.
    - Deve estar ordenada.
    - Deve ter somente os primeiros 5 nomes (algoritmo)
- Imprima a lista de `primeiros`.

TODO: corrigir
 */
public class ExerciciosColecoes {
    public static void main(String[] args) {
        ArrayList<String> pessoas = new ArrayList();
        pessoas.add("Bryana");
        pessoas.add("Kiersten");
        pessoas.add("Zaneta");
        pessoas.add("Frank");
        pessoas.add("Bryana");
        pessoas.add("Tedi");
        pessoas.add("C");
        pessoas.add("Devan");
        pessoas.add("Jerrilyn");
        pessoas.add("Isac");
        pessoas.add("Katherine");

        System.out.println("Lista: ");
        for (String pessoa : pessoas) {
            System.out.println(pessoa);
        }
        //remover
        for (int j = 0; j < pessoas.size(); j++) {
            if(j>=4){
                pessoas.remove(pessoas.size());
        }

        System.out.println("\nLista ordenada: ");
        Set<String> primeiros = new TreeSet<>(pessoas);

/*        for (String x : primeiros) {
            if(i>5){
                primeiros.clear();
            }
            i++;*/
        for (String x : primeiros) {
            System.out.println(x);
//            i++;
//            if(i>=5){
//                break;
        }
    }
}}

