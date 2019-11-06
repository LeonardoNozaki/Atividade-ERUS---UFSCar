package br.ufscar.dcomp.erus.repository;

import br.ufscar.dcomp.erus.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {
}
