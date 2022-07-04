/**
 *
 */
package com.todo1.store.modelo.kardex;

import javax.persistence.Column;
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
@Table(name = "detalle_compra", schema = "kardex")
public class DetalleCompra extends EntidadBase {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_compra")
    private Compra compra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto")
    private Producto producto;

    private Long cantidad;

    @Column(name = "precio_unitario")
    private Double precioUnitario;

    @Column(name = "precio_total")
    private Double precioTotal;

    public Long getCantidad() {
        return this.cantidad;
    }

    public Compra getCompra() {
        return this.compra;
    }

    public Double getPrecioTotal() {
        return this.precioTotal;
    }

    public Double getPrecioUnitario() {
        return this.precioUnitario;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
