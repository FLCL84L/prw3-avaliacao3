package br.edu.ifsp.prw3.prw3_api_slides.conserto;

import br.edu.ifsp.prw3.prw3_api_slides.mecanico.DadosMecanico;
import br.edu.ifsp.prw3.prw3_api_slides.veiculo.DadosVeiculo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroConserto(
        @NotBlank @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}") String dataEntrada,
        @NotBlank @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}") String dataSaida,
        @NotNull @Valid DadosMecanico mecanico,
        @NotNull @Valid DadosVeiculo veiculo) {
}
