package com.wgladson.devtrack.Infra.Mapeadores;

import com.wgladson.devtrack.Dominio.Modelo.Projeto;
import com.wgladson.devtrack.Infra.JpaEntidades.ProjetoEntidade;


public class ProjectJpaMapper {

    public static ProjetoEntidade toEntity(Projeto projeto) {
        return new ProjetoEntidade(projeto);
    }
}
