package com.nzoudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nzoudy.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String>{

}
