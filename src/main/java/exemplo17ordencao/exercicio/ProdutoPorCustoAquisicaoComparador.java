package exemplo17ordencao.exercicio;

import exemplo17ordencao.exercicio.Produto;

import java.util.Comparator;

public class ProdutoPorCustoAquisicaoComparador implements Comparator<Produto> {
    @Override
    public int compare(Produto o1, Produto o2) {
        if(o1.getCustoAquisicao() == null){//Pra evitar NULLPOINTER
            return -1;//jogas os nulos para o inicio
        }
        if(o2.getCustoAquisicao() == null){
            return 1;
        }
        return o1.getCustoAquisicao()
                .compareTo(o2.getCustoAquisicao());
    }
}
