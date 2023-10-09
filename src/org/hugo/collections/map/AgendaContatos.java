package org.hugo.collections.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer numero){
        agendaContatosMap.put(nome, numero);
    }

    public void removerContato (String nome){
        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer contatoPorNome = null;
        if(!agendaContatosMap.isEmpty()){
           contatoPorNome = agendaContatosMap.get(nome);
        }
        return contatoPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("hugo", 5564);
        agendaContatos.adicionarContato("iriel", 5468);
        agendaContatos.adicionarContato("pepo", 4985);
        agendaContatos.adicionarContato("hugo", 6688);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("hugo");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("iriel"));
    }
}
