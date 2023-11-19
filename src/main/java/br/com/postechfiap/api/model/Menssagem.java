package br.com.postechfiap.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Menssagem {

    @Id
    private UUID id;

    @Column(nullable = false)
    @NotEmpty(message = "O campo usuario é obrigatório e não pode estar vaizo")
    private String usuario;

    @Column(nullable = false)
    @NotEmpty(message = "O campo conteudo é obrigatório e não pode estar vaizo")
    private String conteudo;

    @Builder.Default
    private LocalDateTime dataCriacaoMenssagem = LocalDateTime.now();

    @Builder.Default
    private int gostei = 0;

}
