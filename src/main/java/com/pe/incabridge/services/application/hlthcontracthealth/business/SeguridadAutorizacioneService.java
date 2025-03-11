package com.pe.incabridge.services.application.hlthcontracthealth.business;

import com.pe.incabridge.services.application.hlthcontracthealth.model.api.SeguridadAutorizacioneRequest;
import com.pe.incabridge.services.application.hlthcontracthealth.model.api.SeguridadAutorizacioneResponse;
import io.reactivex.Completable;
import io.reactivex.Flowable;

/**
 * ContractService.
 *
 * @author Lima IncaBridge (ibn) <br/>
 * @version 1.0
 */
public interface SeguridadAutorizacioneService {

  Flowable<SeguridadAutorizacioneResponse> findSeguridadAutorizacione(
          String user, String password);
  Completable updateSeguridadAutorizacione(String user,
                         SeguridadAutorizacioneRequest seguridadAutorizacioneRequest);

}
