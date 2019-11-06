package br.ufscar.dcomp.erus.repository;


import br.ufscar.dcomp.erus.model.Responsavel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsavelRepository extends JpaRepository<Responsavel, Integer> {

}

