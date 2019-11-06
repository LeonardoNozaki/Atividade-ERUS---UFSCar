package br.ufscar.dcomp.erus.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome_categoria")
    private String nomeCategoria;

    @Column(name = "descricao")
    private String descricao;

    public Categoria() {
    }

    public Categoria(Integer id, String nomeCategoria, String descricao) {
        this.id = id;
        this.nomeCategoria = nomeCategoria;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
