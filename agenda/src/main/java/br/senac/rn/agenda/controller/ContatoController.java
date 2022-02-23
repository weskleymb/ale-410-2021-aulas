package br.senac.rn.agenda.controller;

import br.senac.rn.agenda.model.Contato;
import br.senac.rn.agenda.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

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

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Optional<Contato> contato = repository.findById(id);
        if (contato.isPresent()) {
            model.addAttribute("contato", contato.get());
            return "formulario-contato";
        }
        return "redirect:/contatos";
    }

    @GetMapping("/remover/{id}")
    public String remover(@PathVariable Integer id) {
        repository.deleteById(id);
        return "redirect:/contatos";
    }

    @PostMapping
    public String salvar(Contato contato) {
        repository.save(contato);
        return "redirect:/contatos";
    }

}
