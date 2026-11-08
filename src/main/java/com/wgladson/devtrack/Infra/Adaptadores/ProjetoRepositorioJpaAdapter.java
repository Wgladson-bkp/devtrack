package com.wgladson.devtrack.Infra.Adaptadores;

import com.wgladson.devtrack.Dominio.Modelo.Projeto;
import com.wgladson.devtrack.Dominio.Repositorio.IProjetoRepository;
import com.wgladson.devtrack.Infra.JpaRepositorio.IProjetoEntidadeRepository;
import com.wgladson.devtrack.Infra.Mapeadores.ProjectJpaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class ProjetoRepositorioJpaAdapter implements IProjetoRepository {

    @Autowired
    private final IProjetoEntidadeRepository repository;

    public ProjetoRepositorioJpaAdapter(IProjetoEntidadeRepository jpaRepository){
        this.repository = jpaRepository;
    }


    @Override
    public void salvar(Projeto projeto) {
        var entidade = ProjectJpaMapper.toEntity(projeto);
        this.repository.save(entidade);
    }

    @Override
    public Optional<Projeto> buscarPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Projeto> buscarTodos() {
        return List.of();
    }

    @Override
    public void excluirPorId(Long id) {

    }
}
