package br.ufscar.dcomp.erus.repository;

import br.ufscar.dcomp.erus.model.Pagina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaginaRepository extends JpaRepository<Pagina, Integer> {
}
