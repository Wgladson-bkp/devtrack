package com.wgladson.devtrack.Dominio.Modelo;

import com.wgladson.devtrack.Aplicacao.DTOs.ProjetoDTO;
import com.wgladson.devtrack.Dominio.Validacao.CampoNaoNulo;

import java.time.LocalDate;
import java.time.OffsetDateTime;

public class Projeto {

    public Projeto(ProjetoDTO dto) {

        this.nomeProjeto = CampoNaoNulo.TextoObrigatorio(dto.nomeProjeto(),"nomeProjeto");
        this.codinome = dto.codinome();
        this.referencia = dto.referencia();
        this.prazo = dto.prazo();
        /*this.idStatus = dto.idStatus();*/
        this.prioridade = dto.prioridade();
        this.descricao = dto.descricao();
        this.gerenteTec = dto.gerenteTec();
        this.criadoPor = dto.criadoPor();
        /*this.criadoEm = dto.criadoEm();*/
        this.atualizadoEm = dto.atualizadoEm();
        this.finalizadoEm = dto.finalizadoEm();
        this.areaDepartamento = dto.areaDepartamento();
        this.equipe = dto.equipe();
        this.gerenteOp = dto.gerenteOp();
    }

    private Long idProjeto;

    private String nomeProjeto;

    private String codinome;

    private String referencia;

    private LocalDate prazo;

    private Long idStatus;

    private Short prioridade;

    private String descricao;

    private Long gerenteTec;

    private Long criadoPor;

    private OffsetDateTime criadoEm;

    private OffsetDateTime atualizadoEm;

    private OffsetDateTime finalizadoEm;

    private String areaDepartamento;

    private String equipe;

    private Long gerenteOp;

    public Projeto() {
    }

    public Long getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(Long idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
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

    public Long getGerenteTec() {
        return gerenteTec;
    }

    public void setGerenteTec(Long gerenteTec) {
        this.gerenteTec = gerenteTec;
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

    public String getAreaDepartamento() {
        return areaDepartamento;
    }

    public void setAreaDepartamento(String areaDepartamento) {
        this.areaDepartamento = areaDepartamento;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public Long getGerenteOp() {
        return gerenteOp;
    }

    public void setGerenteOp(Long gerenteOp) {
        this.gerenteOp = gerenteOp;
    }

}