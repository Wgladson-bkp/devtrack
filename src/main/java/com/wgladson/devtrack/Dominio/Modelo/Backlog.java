package com.wgladson.devtrack.Dominio.Modelo;

import java.time.OffsetDateTime;

public class Backlog {

    private Long idBacklog;

    private Long idProjeto;

    private String descricao;

    private Long criadoPor;

    private OffsetDateTime criadoEm;

    private OffsetDateTime atualizadoEm;

    private OffsetDateTime finalizadoEm;

    public Backlog() {
    }

    public Long getIdBacklog() {
        return idBacklog;
    }

    public void setIdBacklog(Long idBacklog) {
        this.idBacklog = idBacklog;
    }

    public Long getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(Long idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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