package br.ufscar.dcomp.erus.model;

import javax.persistence.*;

@Entity
@Table(name = "contato")
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "contato")
    private String contato;

    @ManyToOne
    @JoinColumn(name = "id_responsavel")
    private Responsavel responsavel;

    public Contato() {
    }

    public Contato(Integer id, String tipo, String contato, Responsavel responsavel) {
        this.id = id;
        this.tipo = tipo;
        this.contato = contato;
        this.responsavel = responsavel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
}
