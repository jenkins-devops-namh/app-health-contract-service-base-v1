package com.pe.incabridge.services.application.hlthcontracthealth.mapper;

import com.pe.incabridge.services.application.hlthcontracthealth.model.api.SeguridadAutorizacioneRequest;
import com.pe.incabridge.services.application.hlthcontracthealth.model.api.SeguridadAutorizacioneResponse;
import com.pe.incabridge.services.application.hlthcontracthealth.model.entity.SeguridadAutorizacione;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface SeguridadAutorizacioneMapper {

    /**
     * Transforms a UserEntity to a UserResponse.
     * @param seguridadAutorizacione the source UserEntity
     * @return a UserResponse with fields mapped from the UserEntity, null if source is null
     */

    SeguridadAutorizacioneResponse toSeguridadAutorizacionesResponse(SeguridadAutorizacione seguridadAutorizacione);


    SeguridadAutorizacione toSeguridadAutorizacionesEntity(SeguridadAutorizacioneRequest seguridadAutorizacioneRequest);
}
