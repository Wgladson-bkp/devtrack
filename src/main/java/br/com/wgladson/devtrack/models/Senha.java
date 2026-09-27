package br.com.wgladson.devtrack.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.OffsetDateTime;

@Entity
@Table(name = "senha")
public class Senha {

    @Id
    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "salt", nullable = false)
    private String salt;

    @Column(name = "expiracao")
    private OffsetDateTime expiracao;

    public Senha() {
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public OffsetDateTime getExpiracao() {
        return expiracao;
    }

    public void setExpiracao(OffsetDateTime expiracao) {
        this.expiracao = expiracao;
    }

}