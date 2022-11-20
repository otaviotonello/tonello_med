package med.Tonello.api.medico;

import med.Tonello.api.endereco.Endereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, Endereco endereco){
}
