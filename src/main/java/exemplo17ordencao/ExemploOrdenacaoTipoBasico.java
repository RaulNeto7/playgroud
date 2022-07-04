package exemplo17ordencao;

import java.util.*;

public class ExemploOrdenacaoTipoBasico {
    public static void main(String[] args) {
        ordenacaoStrings();
        ordenacaoImutavel();
    }
        public static void ordenacaoImutavel(){
        //List<Long> notas = List.of(12L,3L,7L);//Lista imutável
        List<Long> notas = Arrays.asList(12L,3L,7L);//Lista mutável
        Collections.sort(notas);
        for (Long nota : notas) {
            System.out.println(nota);
        }
    }
    protected static void ordenacaoStrings() {
        List<String> artistas = new ArrayList<>();
        artistas.add("TOM JOBIN");
        artistas.add("JOAO GILBERTO");
        Collections.sort(artistas);//Ordena até este momento
        //Collections.sort(artistas, comparadorCustomizadoXYZ);
        Collections.reverse(artistas);//Ordena ao contrário

        for (String artista : artistas) {
            System.out.println(artista);
        }
        artistas.add("CHICO BUARQUE");
        //TODO comparator reverse
        Collections.reverse(artistas);//Ordena até este momento

        System.out.println("\n\nApós o Chico");
        for (String artista : artistas) {
            System.out.println(artista);
        }
    }
}
