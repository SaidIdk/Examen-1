package com.example.ms_estudiante.rtm_controller;

import com.example.ms_estudiante.rtm_entity.Estudiante;
import com.example.ms_estudiante.rtm_service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("estudiante")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @RequestMapping
    public List<Estudiante> listar() {
        return estudianteService.listar();
    }

    @RequestMapping("/{id}")
    public Optional<Estudiante> buscar(@PathVariable Integer id) {
        return estudianteService.buscar(id);
    }

    @PostMapping
    public Estudiante guardar(@RequestBody Estudiante estudiante) {
        System.out.println(estudiante);
        return estudianteService.guardar(estudiante);
    }

    @PutMapping("/{id}")
    public Estudiante actualizar(@PathVariable Integer id, @RequestBody Estudiante estudiante) {
        return estudianteService.actualizar(id, estudiante);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        estudianteService.eliminar(id);
    }
}
