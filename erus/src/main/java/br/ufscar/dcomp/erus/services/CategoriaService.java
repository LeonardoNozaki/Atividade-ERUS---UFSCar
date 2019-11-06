package br.ufscar.dcomp.erus.services;

import br.ufscar.dcomp.erus.model.Categoria;
import br.ufscar.dcomp.erus.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Optional<Categoria> find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);

        return obj;
    }

    public Categoria insert(Categoria obj) {
        obj.setId(null);
        return repo.save(obj);
    }

    public Categoria update(Categoria obj) {
        find(obj.getId());
        return repo.save(obj);
    }

    public void delete(Integer id) {
        find(id);
        try {
            repo.deleteById(id);
        }
        catch (DataIntegrityViolationException e) {
            throw e;
        }
    }

    public List<Categoria> findAll() {
        return repo.findAll();
    }
}