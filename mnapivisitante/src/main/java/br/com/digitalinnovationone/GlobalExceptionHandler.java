package br.com.digitalinnovationone;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import jakarta.inject.Singleton;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Singleton
public class GlobalExceptionHandler implements ExceptionHandler<RuntimeException, HttpResponse> {

    private Erro montarInstanciaErro(RuntimeException e) {
        return Erro.builder()
                .dataHora(LocalDateTime.now())
                .mensagem(e.getMessage())
                .build();
    }

    @Override
    public HttpResponse handle(HttpRequest request, RuntimeException exception) {
        return HttpResponse.status(HttpStatus.BAD_REQUEST).body(montarInstanciaErro(exception));
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Erro {

    private LocalDateTime dataHora;
    private String mensagem;

}