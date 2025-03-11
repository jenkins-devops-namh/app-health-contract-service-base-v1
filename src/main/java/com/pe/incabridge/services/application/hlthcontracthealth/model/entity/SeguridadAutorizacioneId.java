package com.pe.incabridge.services.application.hlthcontracthealth.model.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;
@Builder
@Getter
@Setter
@Embeddable
public class SeguridadAutorizacioneId implements Serializable {
    private static final long serialVersionUID = 8335397933127910504L;
    @Size(max = 2)
    @NotNull
    @Column(name = "AplicacionCodigo", nullable = false, length = 2)
    private String aplicacionCodigo;

    @Size(max = 6)
    @NotNull
    @Column(name = "Grupo", nullable = false, length = 6)
    private String grupo;

    @Size(max = 6)
    @NotNull
    @Column(name = "Concepto", nullable = false, length = 6)
    private String concepto;

    @Size(max = 20)
    @NotNull
    @Column(name = "Usuario", nullable = false, length = 20)
    private String usuario;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SeguridadAutorizacioneId entity = (SeguridadAutorizacioneId) o;
        return Objects.equals(this.grupo, entity.grupo) &&
                Objects.equals(this.concepto, entity.concepto) &&
                Objects.equals(this.usuario, entity.usuario) &&
                Objects.equals(this.aplicacionCodigo, entity.aplicacionCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grupo, concepto, usuario, aplicacionCodigo);
    }

}