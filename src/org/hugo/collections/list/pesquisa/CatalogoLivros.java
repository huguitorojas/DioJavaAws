package org.hugo.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livroList.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = null;
        if(!livroList.isEmpty()){
            livrosPorAutor = new ArrayList<>();
            for(Livro l: livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorAno = null;
        if (!livroList.isEmpty()){
            livroPorAno = new ArrayList<>();
            for(Livro l: livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livroPorAno.add(l);
                }
            }
        }
        return livroPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
                livroPorTitulo = new Livro();
                for(Livro l: livroList){
                    if(l.getTitulo().equals(titulo)){
                        livroPorTitulo = l;
                    }
                }

        }

        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro(new Livro("titulo1", "autor1", 2000));
        catalogo.adicionarLivro(new Livro("titulo2", "autor1", 2007));
        catalogo.adicionarLivro(new Livro("titulo2", "autor2", 2005));
        catalogo.adicionarLivro(new Livro("titulo3", "autor3", 2009));

        System.out.println(catalogo.pesquisarPorAutor("autor2"));

        System.out.println(catalogo.pesquisarPorIntervaloAnos(2005, 2007));

        System.out.println(catalogo.pesquisarPorTitulo("titulo2"));
    }

}
