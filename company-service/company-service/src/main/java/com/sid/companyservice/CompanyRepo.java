package com.sid.companyservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * @author Lhouceine OUHAMZA
 */
@RepositoryRestResource(collectionResourceRel = "companies", path = "companies")
public interface CompanyRepo extends JpaRepository<Company, Long> {
}
