package com.pe.incabridge.services.application.hlthcontracthealth.business.impl;



import com.pe.incabridge.services.application.hlthcontracthealth.business.SeguridadAutorizacioneService;
import com.pe.incabridge.services.application.hlthcontracthealth.mapper.SeguridadAutorizacioneMapper;
import com.pe.incabridge.services.application.hlthcontracthealth.model.api.SeguridadAutorizacioneRequest;
import com.pe.incabridge.services.application.hlthcontracthealth.model.api.SeguridadAutorizacioneResponse;
import com.pe.incabridge.services.application.hlthcontracthealth.model.entity.SeguridadAutorizacione;
import com.pe.incabridge.services.application.hlthcontracthealth.repository.SeguridadAutorizacioneRepository;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


/**
 * ContractServiceImpl.
 *
 * @author Lima IncaBridge (ibn) <br/>
 * @version 1.0
 */
@Service
public class SeguridadAutorizacioneServiceImpl implements SeguridadAutorizacioneService {

  @Autowired
  private SeguridadAutorizacioneRepository seguridadAutorizacioneRepository;

  @Autowired
  private SeguridadAutorizacioneMapper seguridadAutorizacioneMapper;

    @Override
    public Flowable<SeguridadAutorizacioneResponse> findSeguridadAutorizacione(String user, String concepto) {

        List<SeguridadAutorizacione> seguridadAutorizaciones = seguridadAutorizacioneRepository.findByUsuario(user);
        var findObjects = seguridadAutorizaciones.stream()
                .map(seguridadAutorizacioneMapper::toSeguridadAutorizacionesResponse)
                .collect(Collectors.toList());


        return Flowable.fromIterable(findObjects);
    }

    @Override
    public Completable updateSeguridadAutorizacione(String user, SeguridadAutorizacioneRequest seguridadAutorizacioneRequest) {
        return Completable.fromAction(() -> {
            SeguridadAutorizacione seguridadAutorizacione = seguridadAutorizacioneMapper
                    .toSeguridadAutorizacionesEntity(seguridadAutorizacioneRequest);
            seguridadAutorizacioneRepository.save(seguridadAutorizacione);
        });
    }


}