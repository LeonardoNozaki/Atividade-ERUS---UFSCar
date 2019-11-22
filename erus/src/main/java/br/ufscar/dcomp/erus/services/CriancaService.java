package br.ufscar.dcomp.erus.services;

import br.ufscar.dcomp.erus.model.Crianca;
import br.ufscar.dcomp.erus.model.DTO.CriancaDTO;
import br.ufscar.dcomp.erus.model.Responsavel;
import br.ufscar.dcomp.erus.repository.CriancaRepository;
import br.ufscar.dcomp.erus.repository.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CriancaService {

    @Autowired
    private CriancaRepository repo;
    @Autowired
    private ResponsavelRepository repoResponsavel;

    public Optional<Crianca> find(Integer id) {
        Optional<Crianca> obj = repo.findById(id);

        return obj;
    }

    public Crianca insert(CriancaDTO obj) {
        obj.setId(null);

        Optional<Responsavel> res = repoResponsavel.findById(obj.getIdResponsavel());

        Crianca crianca = new Crianca(obj.getId(), obj.getNome(), obj.getDataNascimento(), obj.getnCalcado(), obj.getTamRoupa(), obj.getFoto(), obj.getSexo(), res.get());
        return repo.save(crianca);
    }

    public Crianca update(Crianca obj) {
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

    public List<Crianca> findAll() {
        return repo.findAll();
    }
}