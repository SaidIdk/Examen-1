package com.example.msclientes.rtm_service.impl;


import com.example.msclientes.rtm_entity.Curso;
import com.example.msclientes.rtm_repository.CursoRepository;
import com.example.msclientes.rtm_service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    private CursoRepository cursoRepository;
    @Override
    public List<Curso> listar() {
        return cursoRepository.findAll();
    }

    @Override
    public Optional<Curso> buscar(Integer id) {
        return cursoRepository.findById(id);
    }

    @Override
    public Curso guardar(Curso categoria) {
        return cursoRepository.save(categoria);
    }

    @Override
    public Curso actualizar(Integer id, Curso categoria) {
        categoria.setId(id);
        return cursoRepository.save(categoria);
    }

    @Override
    public void eliminar(Integer id) {
        cursoRepository.deleteById(id);

    }
}
