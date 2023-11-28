package com.example.demo.repo;

import com.example.demo.model.Curriculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CurriculoRepo extends JpaRepository<Curriculo, Long> {
}
