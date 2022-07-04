package com.todo1.store.modelo.kardex;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.todo1.store.modelo.base.EntidadBase;
import com.todo1.store.modelo.general.Catalogo;

/**
 * @author holger.morales
 */
@Entity
@Table(name = "movimiento")
public class Movimiento extends EntidadBase {

    @Column(name = "fecha_movimiento")
    private LocalDate fechaMovimiento;

    private String documento;

    private String referencia;

    private String descripcion;

    private Long cantidad;

    @Column(name = "precio_unitario")
    private Double precioUnitario;

    @Column(name = "precio_total")
    private Double precioTotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_movimiento")
    private Catalogo tipoMovimiento;

    public Long getCantidad() {
        return this.cantidad;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getDocumento() {
        return this.documento;
    }

    public LocalDate getFechaMovimiento() {
        return this.fechaMovimiento;
    }

    public Double getPrecioTotal() {
        return this.precioTotal;
    }

    public Double getPrecioUnitario() {
        return this.precioUnitario;
    }

    public String getReferencia() {
        return this.referencia;
    }

    public Catalogo getTipoMovimiento() {
        return this.tipoMovimiento;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setFechaMovimiento(LocalDate fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setTipoMovimiento(Catalogo tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

}
