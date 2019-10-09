package br.ufscar.dcomp.erus.repository;

import br.ufscar.dcomp.erus.model.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
}
