package br.com.digitalinnovationone;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "visitante")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VisitanteModel {

    @Id
    private String cpf;
    private String nome;

}
