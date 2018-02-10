package com.nzoudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nzoudy.entities.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, String>{

}
