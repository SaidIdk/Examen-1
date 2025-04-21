package com.example.mscurso.rtm_repository;

import com.example.mscurso.rtm_entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface CursoRepository extends JpaRepository<Curso, Integer> {
    Integer id(Integer id);
}
