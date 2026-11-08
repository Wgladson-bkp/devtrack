package com.wgladson.devtrack.Dominio.Validacao;

import java.util.Objects;

public class CampoNaoNulo {
    public  static String TextoObrigatorio(String valor, String campo){
        Objects.requireNonNull(
          valor,
          "Campo "+ campo + "deve ser informado"
        );

        if (valor.isBlank()){
            throw new IllegalArgumentException("O campo " + campo +
                    "Deve ser informado");
        }
        return valor;
    }


}
