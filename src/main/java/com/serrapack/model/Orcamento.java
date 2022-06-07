package com.serrapack.model;

import com.serrapack.enums.Status;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orcamento")
public class Orcamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "DATA_SOLICITACAO")
    private Date dataDaSolicitacao;
    @Column(name = "NUM_ORCAMENTO")
    private String numOrcamento;
    @Column(name = "STATUS_ORCAMENTO")
    @Enumerated(EnumType.STRING)
    private Status status;
    @Column(name = "MUNICIPIO")
    private String municipio;
    @Column(name = "NOME_RESPONSAVEL")
    private String nomeDoResponsavel;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "DETALHES_CONTATO")
    private String detalhesContato;

    public Orcamento() {

    }
    public Orcamento(Long id, Date dataDaSolicitacao, String numOrcamento, Status status, String municipio, String nomeDoResponsavel, String telefone, String detalhesContato) {
        this.id = id;
        this.dataDaSolicitacao = dataDaSolicitacao;
        this.numOrcamento = numOrcamento;
        this.status = status;
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

    public Date getDataDaSolicitacao() {
        return dataDaSolicitacao;
    }

    public void setDataDaSolicitacao(Date dataDaSolicitacao) {
        this.dataDaSolicitacao = dataDaSolicitacao;
    }

    public String getNumOrcamento() {
        return numOrcamento;
    }

    public void setNumOrcamento(String numOrcamento) {
        this.numOrcamento = numOrcamento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
                ", Status='" + status.toString() + '\'' +
                ", municipio='" + municipio + '\'' +
                ", nomeDoResponsavel='" + nomeDoResponsavel + '\'' +
                ", telefone='" + telefone + '\'' +
                ", detalhesContato='" + detalhesContato + '\'' +
                '}';
    }
}
