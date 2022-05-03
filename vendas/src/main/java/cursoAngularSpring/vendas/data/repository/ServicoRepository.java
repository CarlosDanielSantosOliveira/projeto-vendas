package cursoAngularSpring.vendas.data.repository;

import cursoAngularSpring.vendas.model.entities.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {

}
