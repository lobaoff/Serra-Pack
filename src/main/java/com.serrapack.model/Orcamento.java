package com.serrapack.model;


public class Orcamento {
    private Long id;
    private String dataDaSolicitacao;
    private String numOrcamento;
    private String Status;
    private String municipio;
    private String nomeDoResponsavel;
    private String telefone;
    private String detalhesContato;

    public Orcamento() {

    }
    public Orcamento(Long id, String dataDaSolicitacao, String numOrcamento, String status, String municipio, String nomeDoResponsavel, String telefone, String detalhesContato) {
        this.id = id;
        this.dataDaSolicitacao = dataDaSolicitacao;
        this.numOrcamento = numOrcamento;
        Status = status;
        this.municipio = municipio;
        this.nomeDoResponsavel = nomeDoResponsavel;
        this.telefone = telefone;
        this.detalhesContato = detalhesContato;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataDaSolicitacao() {
        return dataDaSolicitacao;
    }

    public void setDataDaSolicitacao(String dataDaSolicitacao) {
        this.dataDaSolicitacao = dataDaSolicitacao;
    }

    public String getNumOrcamento() {
        return numOrcamento;
    }

    public void setNumOrcamento(String numOrcamento) {
        this.numOrcamento = numOrcamento;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNomeDoResponsavel() {
        return nomeDoResponsavel;
    }

    public void setNomeDoResponsavel(String nomeDoResponsavel) {
        this.nomeDoResponsavel = nomeDoResponsavel;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDetalhesContato() {
        return detalhesContato;
    }

    public void setDetalhesContato(String detalhesContato) {
        this.detalhesContato = detalhesContato;
    }

    @Override
    public String toString() {
        return "Orcamento{" +
                "id=" + id +
                ", dataDaSolicitacao='" + dataDaSolicitacao + '\'' +
                ", numOrcamento='" + numOrcamento + '\'' +
                ", Status='" + Status + '\'' +
                ", municipio='" + municipio + '\'' +
                ", nomeDoResponsavel='" + nomeDoResponsavel + '\'' +
                ", telefone='" + telefone + '\'' +
                ", detalhesContato='" + detalhesContato + '\'' +
                '}';
    }
}
