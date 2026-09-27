package br.com.wgladson.devtrack.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.OffsetDateTime;

@Entity
@Table(name = "issue")
public class Issue {

    @Id
    @Column(name = "id_issue", nullable = false)
    private Long idIssue;

    @Column(name = "id_acao", nullable = false)
    private Long idAcao;

    @Column(name = "tabela_referencia", length = 100, nullable = false)
    private String tabelaReferencia;

    @Column(name = "texto", nullable = false)
    private String texto;

    @Column(name = "id_status", nullable = false)
    private Long idStatus;

    @Column(name = "prioridade")
    private Short prioridade;

    @Column(name = "tipo", length = 50, nullable = false)
    private String tipo;

    @Column(name = "responsavel")
    private Long responsavel;

    @Column(name = "criado_por", nullable = false)
    private Long criadoPor;

    @Column(name = "criado_em", nullable = false)
    private OffsetDateTime criadoEm;

    public Issue() {
    }

    public Long getIdIssue() {
        return idIssue;
    }

    public void setIdIssue(Long idIssue) {
        this.idIssue = idIssue;
    }

    public Long getIdAcao() {
        return idAcao;
    }

    public void setIdAcao(Long idAcao) {
        this.idAcao = idAcao;
    }

    public String getTabelaReferencia() {
        return tabelaReferencia;
    }

    public void setTabelaReferencia(String tabelaReferencia) {
        this.tabelaReferencia = tabelaReferencia;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

}