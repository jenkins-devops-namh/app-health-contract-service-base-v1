package com.pe.incabridge.services.application.hlthcontracthealth.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "SeguridadAutorizaciones")
public class SeguridadAutorizacione {
    @EmbeddedId
    private SeguridadAutorizacioneId id;

    @Size(max = 1)
    @Column(name = "OpcionAgregarFlag", length = 1)
    private String opcionAgregarFlag;

    @Size(max = 1)
    @Column(name = "OpcionModificarFlag", length = 1)
    private String opcionModificarFlag;

    @Size(max = 1)
    @Column(name = "OpcionBorrarFlag", length = 1)
    private String opcionBorrarFlag;

    @Size(max = 1)
    @Column(name = "Estado", length = 1)
    private String estado;

    @Size(max = 30)
    @Column(name = "UltimoUsuario", length = 30)
    private String ultimoUsuario;

    @Column(name = "UltimaFechaModif")
    private Instant ultimaFechaModif;

    @Size(max = 1)
    @Column(name = "OpcionAprobarFlag", length = 1)
    private String opcionAprobarFlag;

    @Size(max = 36)
    @NotNull
    @Column(name = "UUID", nullable = false, length = 36)
    private String uuid;

    @Size(max = 1)
    @Column(name = "OpcionProcesarFlag", length = 1)
    private String opcionProcesarFlag;

    @Size(max = 1)
    @Column(name = "OpcionOpcion1Flag", length = 1)
    private String opcionOpcion1Flag;

    @Size(max = 1)
    @Column(name = "OpcionOpcion2Flag", length = 1)
    private String opcionOpcion2Flag;

    @Size(max = 1)
    @Column(name = "OpcionOpcion3Flag", length = 1)
    private String opcionOpcion3Flag;

    @Size(max = 1)
    @Column(name = "OpcionOpcion4Flag", length = 1)
    private String opcionOpcion4Flag;

    @Size(max = 1)
    @Column(name = "OpcionOpcion5Flag", length = 1)
    private String opcionOpcion5Flag;

    @Column(name = "idReemplazo")
    private Integer idReemplazo;

}