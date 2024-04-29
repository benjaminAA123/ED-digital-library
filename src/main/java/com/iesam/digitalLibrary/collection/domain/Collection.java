package com.iesam.digitalLibrary.collection.domain;

public class Collection {

    public Integer id;
    public String autor;
    public String descripcion;

    public Collection(Integer id, String autor, String descripcion) {
        this.id = id;
        this.autor = autor;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
