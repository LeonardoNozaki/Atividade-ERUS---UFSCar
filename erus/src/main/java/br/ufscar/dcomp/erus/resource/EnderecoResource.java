package br.ufscar.dcomp.erus.resource;

import br.ufscar.dcomp.erus.model.Endereco;
import br.ufscar.dcomp.erus.model.DTO.EnderecoDTO;
import br.ufscar.dcomp.erus.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value="/api/enderecos")
public class EnderecoResource {

    @Autowired
    private EnderecoService service;

    @RequestMapping(value = "/{id}", method=RequestMethod.GET)
    public ResponseEntity<Endereco> find(@PathVariable Integer id) {

        Endereco obj = service.find(id).get();
        return ResponseEntity.ok().body(obj);

    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody EnderecoDTO obj) {
        Endereco endereco = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(obj.getIdResponsavel()).toUri();

        return ResponseEntity.created(uri).build();

    }

//    @RequestMapping(value = "/{id}", method=RequestMethod.PUT)
//    public ResponseEntity<Void> update(@RequestBody Endereco obj, @PathVariable Integer id) {
//        obj.setId(id);
//        obj = service.update(obj);
//        return ResponseEntity.noContent().build();
//    }

    @RequestMapping(value = "/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {

        service.delete(id);
        return ResponseEntity.noContent().build();

    }

    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<List<Endereco>> findAll() {

        List<Endereco> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
