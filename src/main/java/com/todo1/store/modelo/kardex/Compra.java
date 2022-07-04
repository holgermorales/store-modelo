/**
 *
 */
package com.todo1.store.modelo.kardex;

import java.time.LocalDate;
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
@Table(name = "compra", schema = "kardex")
public class Compra extends EntidadBase {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column(name = "fecha_compra")
    private LocalDate fechaCompra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_medio_pago")
    private Catalogo medioPago;

    @Column(name = "total_pago")
    private Double totalPago;

    private String comentario;

    @OneToMany(mappedBy = "compra")
    private List<DetalleCompra> detallesCompra;

    public Cliente getCliente() {
        return this.cliente;
    }

    public String getComentario() {
        return this.comentario;
    }

    public List<DetalleCompra> getDetallesCompra() {
        return this.detallesCompra;
    }

    public LocalDate getFechaCompra() {
        return this.fechaCompra;
    }

    public Catalogo getMedioPago() {
        return this.medioPago;
    }

    public Double getTotalPago() {
        return this.totalPago;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setDetallesCompra(List<DetalleCompra> detallesCompra) {
        this.detallesCompra = detallesCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setMedioPago(Catalogo medioPago) {
        this.medioPago = medioPago;
    }

    public void setTotalPago(Double totalPago) {
        this.totalPago = totalPago;
    }

}
