package br.ufscar.dcomp.erus.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @OneToOne
    @JoinColumn(name = "id_responsavel", referencedColumnName = "id")
    private Responsavel responsavel;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "cep")
    private String cep;

    @Column(name = "numero")
    private String numero;

    public Endereco (){

    }

    public Endereco(Responsavel responsavel, String logradouro, String bairro, String cidade, String cep, String numero) {
        this.responsavel = responsavel;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.numero = numero;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
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
