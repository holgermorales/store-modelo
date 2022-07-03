package com.todo1.store.modelo.base;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author holger.morales
 */
@MappedSuperclass
public class EntidadBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "estado_registro")
    private String estadoRegistro;

    @Column(name = "usuario_crea")
    private String usuarioCrea;

    @Column(name = "usuario_modifica")
    private String usuarioModifica;

    @Column(name = "fecha_crea")
    private LocalDate fechaCrea;

    @Column(name = "fecha_modifica")
    private LocalDate fechaModifica;

    public String getEstadoRegistro() {
        return this.estadoRegistro;
    }

    public LocalDate getFechaCrea() {
        return this.fechaCrea;
    }

    public LocalDate getFechaModifica() {
        return this.fechaModifica;
    }

    public Long getId() {
        return this.id;
    }

    public String getUsuarioCrea() {
        return this.usuarioCrea;
    }

    public String getUsuarioModifica() {
        return this.usuarioModifica;
    }

    public void setEstadoRegistro(String estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }

    public void setFechaCrea(LocalDate fechaCrea) {
        this.fechaCrea = fechaCrea;
    }

    public void setFechaModifica(LocalDate fechaModifica) {
        this.fechaModifica = fechaModifica;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
    }

    public void setUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

}
