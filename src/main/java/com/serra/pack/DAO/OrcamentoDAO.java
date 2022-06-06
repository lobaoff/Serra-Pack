package com.serra.pack.DAO;

import com.serrapack.model.Orcamento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class OrcamentoDAO {
    private  List<Orcamento> orcamentoList;

    public OrcamentoDAO() {
        this.orcamentoList = new ArrayList<Orcamento>();
    }

    public void salvarOrcamento (Orcamento orcamento) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("serra-pack");
        EntityManager em = factory.createEntityManager();
      try {
          em.getTransaction().begin();
          System.out.println(orcamento.getTelefone());
          em.persist(orcamento);
          em.getTransaction().commit();
      }catch (Exception e ) {
          em.getTransaction().rollback();
          System.out.println("Erro ao salvar orcamento");
          e.printStackTrace();
      }
      em.close();
    }
    public void removerOrcamento(Long id) {
        Orcamento remover = (Orcamento) orcamentoList.stream().filter(orcamento -> orcamento.getId().equals(id));
        orcamentoList.remove(remover);

    }

    public void listarOrcamento() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("serra-pack");
        EntityManager em = factory.createEntityManager();
//        em.createQuery("select e from Module e where e.status = :status",
//                Module.class).setParameter("status", status).getResultList();

        orcamentoList.forEach(orcamento -> System.out.println(orcamento.toString()));
    }

    public List<Orcamento> getListaOrcamento() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("serra-pack");
        EntityManager em = factory.createEntityManager();
        return (List<Orcamento>) em.createQuery("select o from Orcamento o",Orcamento.class).getResultList();

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
