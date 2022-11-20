package med.Tonello.api.controller;

import med.Tonello.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medico")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico medico) {
        System.out.println(medico);
    }
}
