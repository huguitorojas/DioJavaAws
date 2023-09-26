package org.hugo.collections.list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Produto> produtoList;

    public CarrinhoDeCompras(){
        produtoList = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        produtoList.add(produto);
    }

    public void eliminarProduto(String nome){
        for(Produto p : produtoList){
            if(p.getNome().equalsIgnoreCase(nome)){
                produtoList.remove(p);
            }
        }

    }

    public void listarProdutos(){
        for(Produto p : produtoList){
            System.out.println("Nome: " + p.getNome() +
                    "Descricao: " + p.getDescricao() +
                    "Preco: "+ p.getPreco());
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarProduto(new Produto("tv ", "tv 21 pol ", 87.25));
        carrinho.adicionarProduto(new Produto("som ", "aiwa 1200 ", 96.32));
        carrinho.adicionarProduto(new Produto("guitarra ", "gianini ", 78.65));

        carrinho.listarProdutos();

        carrinho.eliminarProduto("som ");

        carrinho.listarProdutos();

    }

}
