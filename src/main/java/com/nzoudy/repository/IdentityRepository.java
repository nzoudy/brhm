package com.nzoudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nzoudy.entities.Identity;

@Repository
public interface IdentityRepository extends JpaRepository<Identity, String>{

}
