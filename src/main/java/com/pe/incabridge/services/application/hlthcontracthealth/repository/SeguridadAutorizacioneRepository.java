package com.pe.incabridge.services.application.hlthcontracthealth.repository;

import com.pe.incabridge.services.application.hlthcontracthealth.model.entity.SeguridadAutorizacione;
import com.pe.incabridge.services.application.hlthcontracthealth.model.entity.SeguridadAutorizacioneId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SeguridadAutorizacioneRepository extends
        CrudRepository<SeguridadAutorizacione, SeguridadAutorizacioneId> {
    @Query(nativeQuery = true, value = "SELECT * FROM {h-schema}SeguridadAutorizaciones WHERE usuario = ?1 ")
    List<SeguridadAutorizacione> findByUsuario(String usuario);
}