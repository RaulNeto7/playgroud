package exemplo17ordencao;

import java.util.Comparator;

public class DespesaPorValorComparator implements Comparator<Despesa> {


    @Override
    public int compare(Despesa despesa, Despesa outraDespesa) {
        if(despesa.getValor() == null){//Pra evitar NULLPOINTER
            return -1;//jogas os nulos para o inicio
        }
        if(outraDespesa.getValor() == null){
            return 1;
        }
        return despesa.getValor()
                .compareTo(outraDespesa.getValor());
    }
}
