package exemplo17ordencao.exercicio;

import exemplo17ordencao.exercicio.Produto;
import exemplo17ordencao.exercicio.ProdutoPorCustoAquisicaoComparador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
        - Crie uma classe `Produto` com os atributos: `nome`, `custoAquisicao`, `valorVenda`.
        - Crie uma classe `ExercicioOrdenacao` com o método `main`.
        - Crie os produtos lista a seguir.
        - Imprima a lista:
        + Ordenada por `nome` (ordem padrão).
        + Ordenada por `custoAquisicao`.
        + Lucro (`valorVenda` - `custoAquisicao`). (desafio)

        Produtos:

        Descrição, Custo, Venda
        Creme Dental 90g, R$ 2,49, R$ 2,99
        Sabonete em Barra Corporal 90g, R$ 2,99, R$ 3,30
        Protetor Solar 30 FPS 200ml, R$ 37,39, R$ 39,12
        Fralda P Confort - 50 Unidades, R$ 44,90, R$ 44,90
        Condicionador 200ml, R$ 18,90, R$ 15,00
*/
public class ExercicioOrdenacao {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Creme Dental 90g", 2.49F, 2.99F));
        produtos.add(new Produto("Sabonete em Barra Corporal 90g", 2.99F, 3.30F));
        produtos.add(new Produto("Protetor Solar 30 FPS 200ml", 37.39F, 39.12F));
        produtos.add(new Produto("Fralda P Confort - 50 Unidades", 44.90F, 44.90F));
        produtos.add(new Produto("Condicionador 200ml", 18.90F, 15.00F));
        //POR NOME
        Collections.sort(produtos);
        System.out.println("Ordenacao por nomes: ");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome()+" - R$ "+produto.getCustoAquisicao()+" - R$ "+ produto.getValorVenda());
        }
        //POR CUSTO AQUISICAO
        Collections.sort(produtos,new ProdutoPorCustoAquisicaoComparador());
        System.out.println("\nOrdenacao por custo de aquisicao: ");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome()+" - R$ "+produto.getCustoAquisicao()+" - R$ "+ produto.getValorVenda());
        }
        //POR LUCRO
        Collections.sort(produtos, new ProdutoPorLucroComparator());
        System.out.println("\nOrdenacao por lucro: ");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome()+" - R$ "+produto.getCustoAquisicao()+" - R$ "+ produto.getValorVenda());             
        }
    }
}
