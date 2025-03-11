package com.pe.incabridge.services.application.hlthcontracthealth.model.api;

import com.pe.incabridge.services.application.hlthcontracthealth.model.entity.SeguridadAutorizacioneId;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Size;
import java.time.Instant;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SeguridadAutorizacioneRequest {

  private SeguridadAutorizacioneId id;

  @Size(max = 1)
  private String opcionAgregarFlag;

  @Size(max = 1)
  private String opcionModificarFlag;

  @Size(max = 1)
  private String opcionBorrarFlag;

  @Size(max = 1)
  private String estado;

  @Size(max = 30)
  private String ultimoUsuario;

  private Instant ultimaFechaModif;

  @Size(max = 1)
  private String opcionAprobarFlag;

  @Size(max = 36)
  @NotNull
  private String uuid;

  @Size(max = 1)
  private String opcionProcesarFlag;

  @Size(max = 1)
  private String opcionOpcion1Flag;

  @Size(max = 1)
  private String opcionOpcion2Flag;

  @Size(max = 1)
  private String opcionOpcion3Flag;

  @Size(max = 1)
  private String opcionOpcion4Flag;

  @Size(max = 1)
  private String opcionOpcion5Flag;

  private Integer idReemplazo;
}