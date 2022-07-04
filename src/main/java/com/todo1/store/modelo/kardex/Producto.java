/**
 *
 */
package com.todo1.store.modelo.kardex;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.todo1.store.modelo.base.EntidadBase;
import com.todo1.store.modelo.general.Catalogo;

/**
 * @author holger.morales
 */
@Entity
@Table(name = "producto", schema = "kardex")
public class Producto extends EntidadBase {

    private Double precio;

    @Column(name = "precio_venta_publico")
    private Double precioVentaPublico;

    private String titulo;

    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria")
    private Catalogo categoria;

    @OneToMany(mappedBy = "producto")
    private List<Galeria> galerias;

    @OneToMany(mappedBy = "producto")
    private List<DetalleCompra> detallesCompra;

    private Long stock;

    public Catalogo getCategoria() {
        return this.categoria;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public List<Galeria> getGalerias() {
        return this.galerias;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public Double getPrecioVentaPublico() {
        return this.precioVentaPublico;
    }

    public Long getStock() {
        return this.stock;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setCategoria(Catalogo categoria) {
        this.categoria = categoria;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setGalerias(List<Galeria> galerias) {
        this.galerias = galerias;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setPrecioVentaPublico(Double precioVentaPublico) {
        this.precioVentaPublico = precioVentaPublico;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
