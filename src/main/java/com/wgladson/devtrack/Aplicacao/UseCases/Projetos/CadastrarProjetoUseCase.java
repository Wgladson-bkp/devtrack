package com.wgladson.devtrack.Aplicacao.UseCases.Projetos;

import com.wgladson.devtrack.Aplicacao.DTOs.ProjetoDTO;
import com.wgladson.devtrack.Aplicacao.Mapeadores.ProjetoMapper;
import com.wgladson.devtrack.Infra.Adaptadores.ProjetoRepositorioJpaAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CadastrarProjetoUseCase {

    @Autowired
    private final ProjetoRepositorioJpaAdapter repositorio;

    public CadastrarProjetoUseCase(ProjetoRepositorioJpaAdapter repositorio) {
        this.repositorio = repositorio;
    }


    public void  cadastrarProjeto(ProjetoDTO dto){
        var projeto = ProjetoMapper.toDomain(dto);
        repositorio.salvar(projeto);
    }
}
