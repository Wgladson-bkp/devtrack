package com.wgladson.devtrack.Aplicacao.Mapeadores;

import com.wgladson.devtrack.Aplicacao.DTOs.ProjetoDTO;
import com.wgladson.devtrack.Dominio.Modelo.Projeto;


public class ProjetoMapper {
    public static Projeto toDomain(ProjetoDTO dto){
        return new Projeto(dto);
    }

    public  ProjetoDTO toDTO(Projeto projeto){
        return  null;
    }
}
