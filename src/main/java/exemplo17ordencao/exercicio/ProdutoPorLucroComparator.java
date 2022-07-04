package exemplo17ordencao.exercicio;

import java.util.Comparator;

public class ProdutoPorLucroComparator implements Comparator<Produto> {
    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.retornarLucro().compareTo(o2.retornarLucro());
    }
}
