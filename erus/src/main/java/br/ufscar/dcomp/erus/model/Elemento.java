package br.ufscar.dcomp.erus.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "elementos")
public class Elemento implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "texto")
    private String texto;

    @Column(name = "foto")
    private String foto;

    @Column(name = "ordem_elemento")
    private Integer ordemElemento;

    @Column(name = "tamanho_elemento")
    private Integer tamanhoElemento;

    @OneToOne
    @JoinColumn(name = "id_tipo_elemento", referencedColumnName = "id")
    private TipoElemento tipoElemento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pagina")
    private Pagina pagina;

    public Elemento() {
    }

    public Elemento(Integer id, String texto, String foto, Integer ordemElemento, Integer tamanhoElemento, TipoElemento tipoElemento) {
        this.id = id;
        this.texto = texto;
        this.foto = foto;
        this.ordemElemento = ordemElemento;
        this.tamanhoElemento = tamanhoElemento;
        this.tipoElemento = tipoElemento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Integer getOrdemElemento() {
        return ordemElemento;
    }

    public void setOrdemElemento(Integer ordemElemento) {
        this.ordemElemento = ordemElemento;
    }

    public Integer getTamanhoElemento() {
        return tamanhoElemento;
    }

    public void setTamanhoElemento(Integer tamanhoElemento) {
        this.tamanhoElemento = tamanhoElemento;
    }

    public TipoElemento getTipoElemento() {
        return tipoElemento;
    }

    public void setTipoElemento(TipoElemento tipoElemento) {
        this.tipoElemento = tipoElemento;
    }
}
