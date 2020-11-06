package com.demo.service;

import com.demo.dto.DomainDto;
import com.demo.mapper.DomainMapper;
import com.demo.repository.DomainRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/** @author Vadzim_Kavalkou */
@Slf4j
@Service
@RequiredArgsConstructor
public class DomainService {

  private final DomainRepository repository;
  private final DomainMapper mapper;

  public List<DomainDto> get() {
    log.info("[DOMAIN] Retrieving all domains");
    return repository.findAll().stream().map(mapper::dto).collect(Collectors.toList());
  }

  public DomainDto get(Long id) {
    log.info("[DOMAIN] Retrieving domain with id [${}]", id);
    var domain =
        repository
            .findById(id)
            .orElseThrow(() -> new IllegalArgumentException("The domain not found"));
    return mapper.dto(domain);
  }
}
