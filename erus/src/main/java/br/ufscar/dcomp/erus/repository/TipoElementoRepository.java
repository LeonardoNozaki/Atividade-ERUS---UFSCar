package br.ufscar.dcomp.erus.repository;

import br.ufscar.dcomp.erus.model.TipoElemento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoElementoRepository extends JpaRepository<TipoElemento, Integer> {
}

