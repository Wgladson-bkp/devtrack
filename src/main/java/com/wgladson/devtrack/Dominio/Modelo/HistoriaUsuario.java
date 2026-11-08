package com.wgladson.devtrack.Dominio.Modelo;

import java.time.OffsetDateTime;

public class HistoriaUsuario {

    private Long idHistoriaUsuario;

    private Long idDemanda;

    private String descricao;

    private Long responsavel;

    private Short prioridade;

    private String referencia;

    private Long idStatus;

    private Long criadoPor;

    private OffsetDateTime criadoEm;

    private OffsetDateTime atualizadoEm;

    private OffsetDateTime finalizadoEm;

    public HistoriaUsuario() {
    }

    public Long getIdHistoriaUsuario() {
        return idHistoriaUsuario;
    }

    public void setIdHistoriaUsuario(Long idHistoriaUsuario) {
        this.idHistoriaUsuario = idHistoriaUsuario;
    }

    public Long getIdDemanda() {
        return idDemanda;
    }

    public void setIdDemanda(Long idDemanda) {
        this.idDemanda = idDemanda;
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

    public Short getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Short prioridade) {
        this.prioridade = prioridade;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Long getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Long idStatus) {
        this.idStatus = idStatus;
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