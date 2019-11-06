package br.ufscar.dcomp.erus.resource;

import br.ufscar.dcomp.erus.model.Noticia;
import br.ufscar.dcomp.erus.repository.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/noticias")
public class NoticiaResource {

    @Autowired
    public NoticiaRepository noticiaRepository;

    @GetMapping
    public ResponseEntity<List<Noticia>> listar() {
        return ResponseEntity.ok(noticiaRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Noticia> findById(@PathVariable Long id) {
        Optional<Noticia> noticia = noticiaRepository.findById(id);
        return noticia.get() != null ? ResponseEntity.ok(noticia.get()) : ResponseEntity.notFound().build();
    }

}
