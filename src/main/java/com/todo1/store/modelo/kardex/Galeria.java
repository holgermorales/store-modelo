/**
 *
 */
package com.todo1.store.modelo.kardex;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.todo1.store.modelo.base.EntidadBase;

/**
 * @author holger.morales
 */
@Entity
@Table(name = "galeria", schema = "kardex")
public class Galeria extends EntidadBase {

    private String imagen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto")
    private Producto producto;

    public String getImagen() {
        return this.imagen;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
