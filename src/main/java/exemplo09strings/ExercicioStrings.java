package exemplo09strings;

import java.util.Scanner;

/*
Exercício de comparação de Strings:

Criar um programa para gerenciar uma lista de chamadas.
    - Criar um método que pede ao usuário por um nome.
    - Criar um método que adiciona o nome em uma lista.
    - Regra: somente adicionar o nome se esse ainda não estiver na lista.

Exercício de comparação de concatenação de Strings:

- No Programa de Lista de Chamadas, gerar String única com todos os nomes da chamada,
    separados por vírgula e escrever no console.
 */
public class ExercicioStrings {

    public static void main(String[] args) {
        String[] chamada = solicitaNomes();
        imprimeChamada(chamada);
    }

    public static String[] solicitaNomes(){
        String[] chamada = new String[5];

        int posicao = 0;
        while (posicao < chamada.length) {
            System.out.println("Informe um nome:");
            String nome = new Scanner(System.in).nextLine();

            if(!existeNaLista(chamada, nome)){
                chamada[posicao++] = nome;
            }
        }

        return chamada;
    }
    public static void imprimeChamada(String[] chamada){
        StringBuilder sbChamada = new StringBuilder("Alunos: ");
        for (int i = 0; i < chamada.length; i++) {
            sbChamada.append(chamada[i]);
            if(i < chamada.length-1){
                sbChamada.append(", ");
            }
        }
        System.out.println(sbChamada.toString());
    }

    public static boolean existeNaLista(String[] lista, String nome){

        boolean jaExisteNaLista = false;
        for (int j = 0; j < lista.length; j++) {
            //if(lista[j].equals(nome)){ // Isso dá NPE Null Pointer Exception
            if(lista[j] != null && lista[j].equals(nome)){
                System.out.println("Nome já existe na lista!!");
                jaExisteNaLista = true;
                break;
            }
        }
        return jaExisteNaLista;
    }

}
