package br.com.digitalinnovationone;

import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Factory
public class BeanConfiguration {

    @Inject
    private VisitanteRepository repository;

    @Singleton
    VisitanteRepositoryPort visitanteRepositoryPort() {
        return new VisitanteRepositoryImpl(repository);
    }

    @Singleton
    VisitanteServicePort visitanteServicePort() {
        return new VisitanteService(visitanteRepositoryPort());
    }

}
