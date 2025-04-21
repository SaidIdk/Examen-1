package com.example.msclientes.rtm_controller;

import com.example.msclientes.rtm_entity.Curso;
import com.example.msclientes.rtm_service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("curso")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @RequestMapping
    public List<Curso> listar() {
        return cursoService.listar();
    }

    @RequestMapping("/{id}")
    public Optional<Curso> buscar(@PathVariable Integer id) {
        return cursoService.buscar(id);
    }

    @PostMapping
    public Curso guardar(@RequestBody Curso curso) {
        System.out.println(curso);
        return cursoService.guardar(curso);
    }

    @PutMapping("/{id}")
    public Curso actualizar(@PathVariable Integer id, @RequestBody Curso curso) {
        return cursoService.actualizar(id, curso);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        cursoService.eliminar(id);
    }
}
