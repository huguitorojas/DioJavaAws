package org.hugo.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    Set<Produto> produtoSet =null;

    public CadastroProduto() {
        this.produtoSet =  new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo,nome,preco,quantidade));
    }
    public Set<Produto> exibirProdutosPorNome (){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;

    }
    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }


    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1L, "mate", 24, 2);
        cadastroProduto.adicionarProduto(2L, "yerba", 12, 4);
        cadastroProduto.adicionarProduto(3L, "chipa", 5, 4);
        cadastroProduto.adicionarProduto(4L, "mate", 54, 2);

        System.out.println(cadastroProduto.exibirProdutosPorNome());

        System.out.println(cadastroProduto.exibirPorPreco());
    }
}
