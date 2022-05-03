package cursoAngularSpring.vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

/*@Configuration
@Profile("development") //Dessa forma a classe so vai funcionar no ambiente de desenvolvimento
*/
@Development //Configurantion para esta classe
public class MinhaConfiguration {
    //Essa classe serve para configurar algo

    @Bean
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("Rodando a configuração de desenvolvimento.");
        };
    }
}
