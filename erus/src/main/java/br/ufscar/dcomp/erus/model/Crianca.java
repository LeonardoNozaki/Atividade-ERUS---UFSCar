package br.ufscar.dcomp.erus.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "crianca")
public class Crianca implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "dt_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "n_calcado")
    private Integer nCalcado;

    @Column(name = "tam_roupa")
    private String tamRoupa;

    @Column(name = "foto")
    private String foto;

    @Column(name = "sexo")
    private Character sexo;

    @ManyToOne
    @JoinColumn(name = "id_responsavel")
    @NotNull
    private Responsavel responsavel;

    @ManyToMany(mappedBy = "criancas")
    private List<Evento> eventos = new ArrayList<>();

    public Crianca() {
    }

    public Crianca(Integer id, String nome, LocalDate dataNascimento, Integer nCalcado, String tamRoupa, String foto, Character sexo, @NotNull Responsavel responsavel) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nCalcado = nCalcado;
        this.tamRoupa = tamRoupa;
        this.foto = foto;
        this.sexo = sexo;
        this.responsavel = responsavel;
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

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
}
