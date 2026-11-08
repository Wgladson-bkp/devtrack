package com.wgladson.devtrack.Dominio.Modelo;

import java.time.LocalDate;
import java.time.OffsetDateTime;

public class Demanda {

    private Long idDemanda;

    private Long idBacklog;

    private String nomeDemanda;

    private String codinome;

    private String referencia;

    private LocalDate prazo;

    private Long idStatus;

    private Short prioridade;

    private String descricao;

    private Long responsavel;

    private Long criadoPor;

    private OffsetDateTime criadoEm;

    private OffsetDateTime atualizadoEm;

    private OffsetDateTime finalizadoEm;

    public Demanda() {
    }

    public Long getIdDemanda() {
        return idDemanda;
    }

    public void setIdDemanda(Long idDemanda) {
        this.idDemanda = idDemanda;
    }

    public Long getIdBacklog() {
        return idBacklog;
    }

    public void setIdBacklog(Long idBacklog) {
        this.idBacklog = idBacklog;
    }

    public String getNomeDemanda() {
        return nomeDemanda;
    }

    public void setNomeDemanda(String nomeDemanda) {
        this.nomeDemanda = nomeDemanda;
    }

    public String getCodinome() {
        return codinome;
    }

    public void setCodinome(String codinome) {
        this.codinome = codinome;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    public Long getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Long idStatus) {
        this.idStatus = idStatus;
    }

    public Short getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Short prioridade) {
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Long responsavel) {
        this.responsavel = responsavel;
    }

    public Long getCriadoPor() {
        return criadoPor;
    }

    public void setCriadoPor(Long criadoPor) {
        this.criadoPor = criadoPor;
    }

    public OffsetDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(OffsetDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public OffsetDateTime getAtualizadoEm() {
        return atualizadoEm;
    }

    public void setAtualizadoEm(OffsetDateTime atualizadoEm) {
        this.atualizadoEm = atualizadoEm;
    }

    public OffsetDateTime getFinalizadoEm() {
        return finalizadoEm;
    }

    public void setFinalizadoEm(OffsetDateTime finalizadoEm) {
        this.finalizadoEm = finalizadoEm;
    }

}