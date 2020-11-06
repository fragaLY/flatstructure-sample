package com.demo.mapper;

import com.demo.dto.DomainDto;
import com.demo.model.Domain;
import org.mapstruct.Mapper;

/** @author Vadzim_Kavalkou */
@Mapper
public interface DomainMapper {
  DomainDto dto(Domain domain);

  Domain domain(DomainDto dto);
}
