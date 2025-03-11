package com.pe.incabridge.services.application.hlthcontracthealth.model.api;

import com.pe.incabridge.services.application.hlthcontracthealth.model.entity.SeguridadAutorizacioneId;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SeguridadAutorizacioneResponse {

  private SeguridadAutorizacioneId id;

  private String opcionAgregarFlag;
  private String opcionModificarFlag;
  private String opcionBorrarFlag;
  private String estado;
  private String ultimoUsuario;
  private Instant ultimaFechaModif;
  private String opcionAprobarFlag;
  private String uuid;
  private String opcionProcesarFlag;
  private String opcionOpcion1Flag;
  private String opcionOpcion2Flag;
  private String opcionOpcion3Flag;
  private String opcionOpcion4Flag;
  private String opcionOpcion5Flag;
  private Integer idReemplazo;
}