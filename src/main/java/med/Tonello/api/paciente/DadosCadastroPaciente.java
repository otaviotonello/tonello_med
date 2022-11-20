package med.Tonello.api.paciente;

import med.Tonello.api.endereco.Endereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, Endereco endereco) {
}
