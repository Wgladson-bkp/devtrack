package com.wgladson.devtrack.Dominio.Repositorio;

import com.wgladson.devtrack.Dominio.Modelo.Projeto;

import java.util.List;
import java.util.Optional;

public interface IProjetoRepository {

    void salvar(Projeto projeto);
    Optional<Projeto> buscarPorId(Long id);
    List<Projeto> buscarTodos();
    void  excluirPorId(Long id);

}
