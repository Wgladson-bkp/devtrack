package com.wgladson.devtrack.Infra.JpaRepositorio;

import com.wgladson.devtrack.Infra.JpaEntidades.ProjetoEntidade;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IProjetoEntidadeRepository extends JpaRepository<ProjetoEntidade,Long > {
}
