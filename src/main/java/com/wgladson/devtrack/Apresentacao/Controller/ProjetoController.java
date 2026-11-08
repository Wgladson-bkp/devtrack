package com.wgladson.devtrack.Apresentacao.Controller;

import com.wgladson.devtrack.Aplicacao.DTOs.ProjetoDTO;
import com.wgladson.devtrack.Aplicacao.UseCases.Projetos.CadastrarProjetoUseCase;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("projetos")
public class ProjetoController {

    public ProjetoController(CadastrarProjetoUseCase cadastrarProjetoUseCase){
        this.CadastrarProjetoUseCase = cadastrarProjetoUseCase;
    }

    private final CadastrarProjetoUseCase CadastrarProjetoUseCase;


    @PostMapping
    public void cadastraProjeto(@RequestBody ProjetoDTO dto) {
        this.CadastrarProjetoUseCase.cadastrarProjeto(dto);
    }
}