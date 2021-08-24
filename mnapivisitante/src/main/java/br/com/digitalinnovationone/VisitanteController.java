package br.com.digitalinnovationone;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("/visitantes")
public class VisitanteController {

    @Inject
    private VisitanteServicePort service;

    @Post
    public void cadastrar(@Body VisitanteDto dto) {
        service.cadastrar(dto);
    }

    @Get(value = "/{cpf}")
    public Visitante procurarPorCpf(String cpf) {
        return service.procurarPorCpf(cpf);
    }

}
