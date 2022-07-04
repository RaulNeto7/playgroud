package exemplo14collections.exercicioExtra;
/*
a. Popular uma lista com as seguintes cores: (Amarelo, Azul, Vermelho, Preto,
        Branco, Azul)
        b. Imprimir o resultado
        c. Remover o item 2 da lista
        d. Imprimir o resultado
        e. Adicionar a cor (Marrom)
        f. Imprimir a quantidade de itens da lista
        g. Imprimir o valor armazenado no último índice da lista
        h. Substituir o valor “Azul” por “Verde”
        i. Imprimir o conteúdo da collection
        j. Verificar se existe a cor “Azul” se não existir e houver a cor “Vermelho”, deve
        ser adicionada a cor “Azul”, senão adicionar “Roxo”
        k. Imprimir o conteúdo da collection
        Resultado esperado:
        [Amarelo, Azul, Vermelho, Preto, Branco, Azul]
        [Amarelo, Vermelho, Preto, Branco, Azul]
        6
        Marrom
        [Amarelo, Vermelho, Preto, Branco, Verde, Marrom]
        [Amarelo, Vermelho, Preto, Branco, Verde, Marrom, Azul]
*/

import java.util.ArrayList;
import java.util.List;

public class primeiro {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Preto");
        cores.add("Branco");
        cores.add("Azul");
        System.out.println("Letra A:");
        for (String cor : cores) {
            System.out.println(cor);
        }
        System.out.println("\n");
        removerDois(cores);
        System.out.println("\n");
        addCor(cores);
        System.out.println("Letra F: " + "\n" + cores.size());
        System.out.println("\n");
        imprimirUltimoValor(cores);//g
        System.out.println("Letra H e I: ");
        substituirAzul(cores);
        System.out.println("Letra J e K: ");
        //cores.add("Azul"); TESTE PARA SABER O ROXO
        verificarCorAzul(cores);
    }

    public static void removerDois(ArrayList<String> x) {
        x.remove(1);
        System.out.println("Letra B:");
        for (String cor : x) {
            System.out.println(cor);
        }
    }

    public static void addCor(ArrayList<String> y) {
        y.add("Marrom");
    }

    public static void imprimirUltimoValor(ArrayList<String> z) {
        String ultimoIndice = z.get(z.size() - 1);
        System.out.println("Letra G:");
        System.out.println(ultimoIndice);
    }

    public static void substituirAzul(ArrayList<String> a) {
        int numAzul = a.indexOf("Azul");
        a.set(numAzul, "Verde");
        for (String s : a) {
            System.out.println(s);
        }
    }

    public static void verificarCorAzul(ArrayList<String> b) {
        boolean verificadorAzul = b.contains("Azul");
        boolean verificadorVermelho = b.contains("Vermelho");
        if (!verificadorAzul && verificadorVermelho) {
            b.add("Azul");
        } else {
            b.add("Roxo");
        }
        for (String s : b) {
            System.out.println(s);
        }
    }
}
