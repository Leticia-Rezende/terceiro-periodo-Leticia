package br.com.ProjetoLeticia.repository;

import br.com.ProjetoLeticia.enitiy.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {


}
