package cursoAngularSpring.vendas;

import cursoAngularSpring.vendas.data.repository.ClienteRepository;
import cursoAngularSpring.vendas.model.entities.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

	@Autowired ClienteRepository clienteRepository;

	@Bean
	public CommandLineRunner run() {
		return args -> {
			Cliente cliente = Cliente.builder().cpf("12345678910").nome("daniel").build();
			clienteRepository.save(cliente);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
