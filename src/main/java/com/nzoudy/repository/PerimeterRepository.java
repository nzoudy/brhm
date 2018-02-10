package com.nzoudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nzoudy.entities.Perimeter;

@Repository
public interface PerimeterRepository extends JpaRepository<Perimeter, String>{

}
