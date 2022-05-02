package cursoAngularSpring.vendas.service;

import cursoAngularSpring.vendas.data.repository.ClienteRepository;
import cursoAngularSpring.vendas.model.entities.Cliente;

public class ClienteService {

    //Injeção de dependência do repository
    private ClienteRepository clienteRepository; //Variável que vai ser passado como referência no construtor da classe

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    //Tambem posso utilizar o @Autowired para facilitar


    public void validarCliente(Cliente cliente) {
        //Aplica validações
    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        ClienteRepository clienteRepository = new ClienteRepository();
        clienteRepository.persistir(cliente);
    }

}
