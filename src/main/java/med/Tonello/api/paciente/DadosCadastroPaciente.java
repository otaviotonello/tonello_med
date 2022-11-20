package med.Tonello.api.paciente;

import med.Tonello.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, DadosEndereco dadosEndereco) {
}
