package org.hugo.collections.list;

import java.util.ArrayList;

import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefas(String descricao){

        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){

        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }

        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumTotalDeTarefas(){

        return tarefaList.size();
    }
    public void obterDescricaoTarefas(){

        System.out.println(tarefaList);
    }


    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("o numero de elementos na lista e: " + listaTarefa.obterNumTotalDeTarefas());
        listaTarefa.adicionarTarefas("tarefa 1");
        listaTarefa.adicionarTarefas("tarefa 1");
        listaTarefa.adicionarTarefas("tarefa 2");

        System.out.println("o numero de elementos na lista e: " + listaTarefa.obterNumTotalDeTarefas());

        listaTarefa.removerTarefa("tarefa 2");
        System.out.println("o numero de elementos na lista e: " + listaTarefa.obterNumTotalDeTarefas());

        listaTarefa.obterDescricaoTarefas();
    }
}


