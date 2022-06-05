package com.serra.pack.DAO;

import com.serrapack.model.Orcamento;

import java.util.ArrayList;
import java.util.List;

public class OrcamentoDAO {
    private  List<Orcamento> orcamentoList;

    public OrcamentoDAO() {
        this.orcamentoList = new ArrayList<Orcamento>();
    }

    public void salvarOrcamento (Orcamento orcamento) {
    orcamentoList.add(orcamento);
    }
    public void removerOrcamento(Long id) {
        Orcamento remover = (Orcamento) orcamentoList.stream().filter(orcamento -> orcamento.getId().equals(id));
        orcamentoList.remove(remover);

    }

    public void listarOrcamento() {
        orcamentoList.forEach(orcamento -> System.out.println(orcamento.toString()));
    }

    public List<Orcamento> getListaOrcamento() {
        return orcamentoList;
    }

    public List<Orcamento> listarPorPesquisa(String opcao, String pesquisa) {
        switch (opcao) {
            case "N° Orcamento" : List<Orcamento> result = (List<Orcamento>) orcamentoList.stream().filter(orcamento -> orcamento.getNumOrcamento().equals(pesquisa));
            return result;
            default:
                break;
        }
        return null;
    }

}
