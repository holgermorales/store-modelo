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
@Table(name = "cliente", schema = "kardex")
public class Cliente extends EntidadBase {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_identificacion")
    private Catalogo tipoIdentificacion;

    private String nombres;

    private String telefono;

    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getNombres() {
        return this.nombres;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public Catalogo getTipoIdentificacion() {
        return this.tipoIdentificacion;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTipoIdentificacion(Catalogo tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

}
