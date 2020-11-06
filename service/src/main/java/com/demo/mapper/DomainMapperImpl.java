package com.demo.mapper;

import com.demo.dto.DomainDto;
import com.demo.model.Domain;
import org.springframework.stereotype.Component;

/** @author Vadzim_Kavalkou */
@Component("domainMapper")
public class DomainMapperImpl implements DomainMapper {

  @Override
  public DomainDto dto(Domain domain) {
    return new DomainDto(domain.getId(), domain.getName());
  }

  @Override
  public Domain domain(DomainDto dto) {
    return new Domain(dto.getId(), dto.getName());
  }
}
