package br.edu.ifsp.prw3.prw3_api_slides.conserto;

import br.edu.ifsp.prw3.prw3_api_slides.mecanico.DadosMecanico;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoConserto(
        @NotNull Long id,
        String dataSaida,
        DadosMecanico mecanico) {
}