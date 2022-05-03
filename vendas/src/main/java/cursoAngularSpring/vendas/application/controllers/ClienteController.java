package cursoAngularSpring.vendas.application.controllers;

import cursoAngularSpring.vendas.data.repository.ClienteRepository;
import cursoAngularSpring.vendas.model.entities.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }



}
