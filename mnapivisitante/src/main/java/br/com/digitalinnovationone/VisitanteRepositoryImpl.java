package br.com.digitalinnovationone;

import jakarta.inject.Singleton;

@Singleton
public class VisitanteRepositoryImpl implements VisitanteRepositoryPort {

    private final VisitanteRepository repository;

    public VisitanteRepositoryImpl(VisitanteRepository repository) {
        this.repository = repository;
    }

    @Override
    public void salvar(Visitante visitante) {
        var model = new VisitanteModel(visitante.getCpf(), visitante.getNome());
        repository.save(model);
    }

    @Override
    public Visitante procurarPorCpf(String cpf) {
        var model = repository.findById(cpf);
        return new Visitante(model.get().getCpf(), model.get().getNome());
    }
}
