package exemplo17ordencao;

public class Despesa implements Comparable<Despesa> {
    private String descricao;
    private Float valor;
    public Despesa(String descricao, Float valor){
        this.descricao=descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }
    public Float getValor(){
        return valor;
    }
    //antes -1
    //na mesma posicao 0
    //depois +1
    @Override
    public int compareTo(Despesa outraDespesa) {
/*        if(this.valor>outraDespesa.valor){
            return 1;
        }else {
            return -1;
        }
        return 0;
 ordenando pelo valor
 */
        return this.descricao.compareTo(outraDespesa.descricao);
        /*
        ou
                int comparacao = this.descricao.compareTo(outraDespesa.descricao);
                return comparacao;
                */
    }
}
