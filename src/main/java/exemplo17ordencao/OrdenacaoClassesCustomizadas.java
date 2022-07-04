package exemplo17ordencao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoClassesCustomizadas {
    public static void main(String[] args) {
        List<Despesa> despesas = new ArrayList<>();
        despesas.add(new Despesa("Netflix",45.90F));
        despesas.add(new Despesa("Amazon Prime",19.90F));
        despesas.add(new Despesa("Disney Plus",null));//vai ficar em primeiro no comaparador de valor
        despesas.add(new Despesa("HBO MAX",10.90F));
        Collections.sort(despesas);
        System.out.println("Por descricao: ");
        for (Despesa despesa : despesas) {
            System.out.println(despesa.getDescricao()+ " - " +despesa.getValor());
        }
        System.out.println("\nPor valor: ");
        Collections.sort(despesas,new DespesaPorValorComparator());
        for (Despesa despesa : despesas) {
            System.out.println(despesa.getDescricao()+ " - " +despesa.getValor());
        }
    }
}
