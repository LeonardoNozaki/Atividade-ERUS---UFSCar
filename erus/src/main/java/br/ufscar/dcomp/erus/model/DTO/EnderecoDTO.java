package br.ufscar.dcomp.erus.model.DTO;

import java.io.Serializable;
import java.time.LocalDate;

public class EnderecoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idResponsavel;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String cep;
    private String numero;

    public EnderecoDTO() {
    }

    public EnderecoDTO(Integer idResponsavel, String logradouro, String bairro, String cidade, String cep, String numero) {
        this.idResponsavel = idResponsavel;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.numero = numero;
    }

    public Integer getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(Integer idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
