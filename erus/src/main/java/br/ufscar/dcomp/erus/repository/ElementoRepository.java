package br.ufscar.dcomp.erus.repository;

import br.ufscar.dcomp.erus.model.Elemento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementoRepository extends JpaRepository<Elemento, Integer> {
}
