package org.hugo.collections.set;

public class ConjuntoConvidadosTeste {

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println(conjuntoConvidados.contarConvidados() + " convidados");

        conjuntoConvidados.adicionarConvidado("hugo", 1);
        conjuntoConvidados.adicionarConvidado("iriel", 2);
        conjuntoConvidados.adicionarConvidado("pepo", 3);
        conjuntoConvidados.adicionarConvidado("pepo", 3);


        System.out.println(conjuntoConvidados.contarConvidados() + " convidados");

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(3);

        conjuntoConvidados.exibirConvidados();

    }
}
