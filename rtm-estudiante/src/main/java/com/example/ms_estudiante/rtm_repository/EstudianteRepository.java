package com.example.ms_estudiante.rtm_repository;

import com.example.ms_estudiante.rtm_entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
    Integer id(Integer id);
}
