package exemplo17ordencao.exercicio;
public class Produto implements Comparable<Produto>{
    private String nome;
    private Float custoAquisicao;
    private Float valorVenda;

    public Produto(String nome, Float custoAquisicao,Float valorVenda){
        this.nome=nome;
        this.custoAquisicao = custoAquisicao;
        this.valorVenda = valorVenda;
    }

    public Float getCustoAquisicao() {
        return custoAquisicao;
    }

    public Float getValorVenda() {
        return valorVenda;
    }

    public String getNome() {
        return nome;
    }
    @Override
    public int compareTo(Produto o) {
        return 0;
    }
    public Float retornarLucro(){
        return this.valorVenda-this.custoAquisicao;
    }
}
