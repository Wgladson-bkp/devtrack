package com.wgladson.devtrack.Dominio.Modelo;

import java.time.OffsetDateTime;

public class Senha {

    private Long idUsuario;

    private String senha;

    private String salt;

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