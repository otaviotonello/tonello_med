package med.Tonello.api.medico;

import med.Tonello.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco dadosEndereco){
}
