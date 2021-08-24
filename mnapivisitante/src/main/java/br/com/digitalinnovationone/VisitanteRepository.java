package br.com.digitalinnovationone;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface VisitanteRepository extends JpaRepository<VisitanteModel, String> {
}
