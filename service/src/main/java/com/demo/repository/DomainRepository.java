package com.demo.repository;

import com.demo.model.Domain;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Vadzim_Kavalkou
 */
public interface DomainRepository extends JpaRepository<Domain, Long> {
}
