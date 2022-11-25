package med.Tonello.api.controller;

import med.Tonello.api.medico.DadosCadastroMedico;
import med.Tonello.api.medico.Medico;
import med.Tonello.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@RequestMapping("medico")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        medicoRepository.save(new Medico(dados));
    }
}
