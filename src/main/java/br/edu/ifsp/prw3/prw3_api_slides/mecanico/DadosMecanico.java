package br.edu.ifsp.prw3.prw3_api_slides.mecanico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosMecanico(
        @NotBlank String nome,
        @NotNull Integer anosExperiencia) {
}