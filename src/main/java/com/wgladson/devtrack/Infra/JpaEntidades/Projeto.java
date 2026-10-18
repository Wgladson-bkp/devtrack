package com.wgladson.devtrack.Infra.JpaEntidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.OffsetDateTime;

@Entity
@Table(name = "projeto")
public class Projeto {

    @Id
    @Column(name = "id_projeto", nullable = false)
    private Long idProjeto;

    @Column(name = "nome_projeto", length = 200, nullable = false)
    private String nomeProjeto;

    @Column(name = "codinome", length = 100)
    private String codinome;

    @Column(name = "referencia", length = 100)
    private String referencia;

    @Column(name = "prazo")
    private LocalDate prazo;

    @Column(name = "id_status", nullable = false)
    private Long idStatus;

    @Column(name = "prioridade")
    private Short prioridade;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "gerente_tec", nullable = false)
    private Long gerenteTec;

    @Column(name = "criado_por", nullable = false)
    private Long criadoPor;

    @Column(name = "criado_em", nullable = false)
    private OffsetDateTime criadoEm;

    @Column(name = "atualizado_em")
    private OffsetDateTime atualizadoEm;

    @Column(name = "finalizado_em")
    private OffsetDateTime finalizadoEm;

    @Column(name = "area_departamento", length = 100)
    private String areaDepartamento;

    @Column(name = "equipe", length = 100)
    private String equipe;

    @Column(name = "gerente_op", nullable = false)
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