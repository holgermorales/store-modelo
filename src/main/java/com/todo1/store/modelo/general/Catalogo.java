package com.todo1.store.modelo.general;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.todo1.store.modelo.base.EntidadBase;

/**
 * @author developer
 */
@Entity
@Table(name = "catalogo", schema = "general")
public class Catalogo extends EntidadBase {

    private String grupo;

    private String nemonico;

    private String nombre;

    private String descripcion;

    private String visible;

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getGrupo() {
        return this.grupo;
    }

    public String getNemonico() {
        return this.nemonico;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getVisible() {
        return this.visible;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setNemonico(String nemonico) {
        this.nemonico = nemonico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

}
