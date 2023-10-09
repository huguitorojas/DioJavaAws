package org.hugo.collections.set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarContato(String nome, int numeroAtualizado){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numeroAtualizado);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("huguito", 123654);
        agendaContatos.adicionarContato("iriel", 45687);
        agendaContatos.adicionarContato("pepocho", 987984);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("iriel"));

        agendaContatos.atualizarContato("huguito", 879849);

        agendaContatos.exibirContatos();

    }
}

