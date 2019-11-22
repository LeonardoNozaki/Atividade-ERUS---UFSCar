package br.ufscar.dcomp.erus.resource;

import br.ufscar.dcomp.erus.model.Crianca;
import br.ufscar.dcomp.erus.model.DTO.CriancaDTO;
import br.ufscar.dcomp.erus.services.CriancaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value="/api/criancas")
public class CriancaResource {

    @Autowired
    private CriancaService service;

    @RequestMapping(value = "/{id}", method=RequestMethod.GET)
    public ResponseEntity<Crianca> find(@PathVariable Integer id) {

        Crianca obj = service.find(id).get();
        return ResponseEntity.ok().body(obj);

    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody CriancaDTO obj) {
        Crianca crianca = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).build();

    }

    @RequestMapping(value = "/{id}", method=RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody Crianca obj, @PathVariable Integer id) {
        obj.setId(id);
        obj = service.update(obj);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {

        service.delete(id);
        return ResponseEntity.noContent().build();

    }

    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<List<Crianca>> findAll() {

        List<Crianca> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
