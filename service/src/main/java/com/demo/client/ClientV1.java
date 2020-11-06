package com.demo.client;

import com.demo.api.Api;
import com.demo.dto.DomainDto;
import com.demo.service.DomainService;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/** @author Vadzim_Kavalkou */
@RestController
@RequiredArgsConstructor
public class ClientV1 implements Api {

  private final DomainService service;

  @Override
  public ResponseEntity<List<DomainDto>> domains() {
    return ResponseEntity.ok(service.get());
  }

  @Override
  public ResponseEntity<DomainDto> domain(@NotNull Long id) {
    return ResponseEntity.ok(service.get(id));
  }
}
