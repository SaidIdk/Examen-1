package com.example.ms_estudiante.rtm_util;

import com.example.ms_estudiante.rtm_entity.Estudiante;
import com.example.ms_estudiante.rtm_repository.EstudianteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EstudianteSeeder implements CommandLineRunner {
    private final EstudianteRepository estudianteRepository;

    public EstudianteSeeder(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }


    @Override
    public void run(String... args) {

//        categoriaRepository.deleteAll();

        if (estudianteRepository.count() == 0) { // Verifica si la tabla está vacía
            // Crear objetos de estudiantes
            Estudiante est1 = new Estudiante(null, "Juan Pérez");
            Estudiante est2 = new Estudiante(null, "María García");
            Estudiante est3 = new Estudiante(null, "Luis Fernández");
            Estudiante est4 = new Estudiante(null, "Ana Rodríguez");
            Estudiante est5 = new Estudiante(null, "Carlos Ramírez");
            Estudiante est6 = new Estudiante(null, "Lucía Sánchez");
            Estudiante est7 = new Estudiante(null, "Miguel Torres");
            Estudiante est8 = new Estudiante(null, "Sofía Herrera");
            Estudiante est9 = new Estudiante(null, "Diego Castro");
            Estudiante est10 = new Estudiante(null, "Valentina Morales");
            Estudiante est11 = new Estudiante(null, "Andrés Rojas");
            Estudiante est12 = new Estudiante(null, "Camila Delgado");
            Estudiante est13 = new Estudiante(null, "Sebastián Cruz");
            Estudiante est14 = new Estudiante(null, "Paula Medina");
            Estudiante est15 = new Estudiante(null, "Gabriel Reyes");
            Estudiante est16 = new Estudiante(null, "Daniela Paredes");
            Estudiante est17 = new Estudiante(null, "Tomás Aguirre");
            Estudiante est18 = new Estudiante(null, "Isabela Flores");
            Estudiante est19 = new Estudiante(null, "Javier Romero");
            Estudiante est20 = new Estudiante(null, "Renata Campos");


            // Guardar en la base de datos
            estudianteRepository.save(est1);
            estudianteRepository.save(est2);
            estudianteRepository.save(est3);
            estudianteRepository.save(est4);
            estudianteRepository.save(est5);
            estudianteRepository.save(est6);
            estudianteRepository.save(est7);
            estudianteRepository.save(est8);
            estudianteRepository.save(est9);
            estudianteRepository.save(est10);
            estudianteRepository.save(est11);
            estudianteRepository.save(est12);
            estudianteRepository.save(est13);
            estudianteRepository.save(est14);
            estudianteRepository.save(est15);
            estudianteRepository.save(est16);
            estudianteRepository.save(est17);
            estudianteRepository.save(est18);
            estudianteRepository.save(est19);
            estudianteRepository.save(est20);

            System.out.println("✅ Datos de estudiantes insertadas correctamente.");
        }  else {
            System.out.println("Los estudiantes ya existen, no se insertaron datos.");
        }

    }
}
