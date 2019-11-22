package br.ufscar.dcomp.erus.model.DTO;

import java.io.Serializable;
import java.time.LocalDate;

public class CriancaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private LocalDate dataNascimento;
    private Integer nCalcado;
    private String tamRoupa;
    private String foto;
    private Character sexo;
    private Integer idResponsavel;

    public CriancaDTO() {
    }

    public CriancaDTO(Integer id, String nome, LocalDate dataNascimento, Integer nCalcado, String tamRoupa, String foto, Character sexo, Integer id_responsavel) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nCalcado = nCalcado;
        this.tamRoupa = tamRoupa;
        this.foto = foto;
        this.sexo = sexo;
        this.idResponsavel = id_responsavel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getnCalcado() {
        return nCalcado;
    }

    public void setnCalcado(Integer nCalcado) {
        this.nCalcado = nCalcado;
    }

    public String getTamRoupa() {
        return tamRoupa;
    }

    public void setTamRoupa(String tamRoupa) {
        this.tamRoupa = tamRoupa;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Integer getIdResponsavel() {
        return idResponsavel;
    }

    public void setId_responsavel(Integer id_responsavel) {
        this.idResponsavel = id_responsavel;
    }
}
