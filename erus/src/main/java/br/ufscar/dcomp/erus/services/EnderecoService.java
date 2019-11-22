package br.ufscar.dcomp.erus.services;

import br.ufscar.dcomp.erus.model.Endereco;
import br.ufscar.dcomp.erus.model.DTO.EnderecoDTO;
import br.ufscar.dcomp.erus.model.Responsavel;
import br.ufscar.dcomp.erus.repository.EnderecoRepository;
import br.ufscar.dcomp.erus.repository.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repo;
    @Autowired
    private ResponsavelRepository repoResponsavel;

    public Optional<Endereco> find(Integer id) {
        Optional<Endereco> obj = repo.findById(id);

        return obj;
    }

    public Endereco insert(EnderecoDTO obj) {
        Optional<Responsavel> res = repoResponsavel.findById(obj.getIdResponsavel());

        Endereco endereco = new Endereco(res.get(), obj.getLogradouro(), obj.getBairro(),obj.getCidade(), obj.getCep(), obj.getNumero());
        return repo.save(endereco);
    }

    public Endereco update(Endereco obj) {
        find(obj.getResponsavel().getId());
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

    public List<Endereco> findAll() {
        return repo.findAll();
    }
}