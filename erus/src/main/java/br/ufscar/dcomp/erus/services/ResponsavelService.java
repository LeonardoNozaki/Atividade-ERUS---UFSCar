package br.ufscar.dcomp.erus.services;

import br.ufscar.dcomp.erus.model.Responsavel;
import br.ufscar.dcomp.erus.repository.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponsavelService {

    @Autowired
    private ResponsavelRepository repo;

    public Optional<Responsavel> find(Integer id) {
        Optional<Responsavel> obj = repo.findById(id);

        return obj;
    }

    public Responsavel insert(Responsavel obj) {
        obj.setId(null);
        return repo.save(obj);
    }

    public Responsavel update(Responsavel obj) {
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

    public List<Responsavel> findAll() {
        return repo.findAll();
    }
}