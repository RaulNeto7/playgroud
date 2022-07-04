package exemplo17ordencao.exercicio;

public class ComparacaoProdutos {
    public static void main(String[] args) {

        Produto creme = new Produto("Creme", 5f,10F);
        Produto creme2 = new Produto("Creme", 5f,10F);
        Produto copiaCreme2 = creme2;
        Produto sabonete = new Produto("Sabonete",1F,4F);

        System.out.println(creme == sabonete);
        System.out.println(creme == creme2);
        System.out.println(creme2 == copiaCreme2);
        System.out.println(creme.equals(creme2));

    }
}
