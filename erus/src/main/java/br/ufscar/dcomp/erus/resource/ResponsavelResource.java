package br.ufscar.dcomp.erus.resource;

import br.ufscar.dcomp.erus.model.Responsavel;
import br.ufscar.dcomp.erus.services.ResponsavelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value="/api/responsaveis")
public class ResponsavelResource {

    @Autowired
    private ResponsavelService service;

    @RequestMapping(value = "/{id}", method=RequestMethod.GET)
    public ResponseEntity<Responsavel> find(@PathVariable Integer id) {

        Responsavel obj = service.find(id).get();
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody Responsavel obj) {

        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).build();

    }

    @RequestMapping(value = "/{id}", method=RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody Responsavel obj, @PathVariable Integer id) {
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
    public ResponseEntity<List<Responsavel>> findAll() {

        List<Responsavel> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
