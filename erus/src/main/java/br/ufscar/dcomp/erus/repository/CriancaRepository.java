package br.ufscar.dcomp.erus.repository;

import br.ufscar.dcomp.erus.model.Crianca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriancaRepository extends JpaRepository<Crianca, Integer> {
}
