package br.senac.rn.agenda.controller;

import br.senac.rn.agenda.model.Contato;
import br.senac.rn.agenda.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contatos")
public class ContatoController {

    @Autowired
    private ContatoRepository repository;

    @GetMapping
    public String lista(Model model) {
        model.addAttribute("contatos", repository.findAll());
        return "lista-contatos";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("contato", new Contato());
        return "formulario-contato";
    }

    @PostMapping
    public String salvar(Contato contato) {
        repository.save(contato);
        return "redirect:/contatos";
    }

}
