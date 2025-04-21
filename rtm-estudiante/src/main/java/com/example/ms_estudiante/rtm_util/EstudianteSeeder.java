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
            // Crear objetos de categorías
            Estudiante cat1 = new Estudiante(null, "Electrónica");
            Estudiante cat2 = new Estudiante(null, "Automotriz");
            Estudiante cat3 = new Estudiante(null, "Ropa");
            Estudiante cat4 = new Estudiante(null, "Hogar");
            Estudiante cat5 = new Estudiante(null, "Juguetes");
            Estudiante cat6 = new Estudiante(null, "Libros");
            Estudiante cat7 = new Estudiante(null, "Deportes");
            Estudiante cat8 = new Estudiante(null, "Salud");
            Estudiante cat9 = new Estudiante(null, "Belleza");
            Estudiante cat10 = new Estudiante(null, "Mascotas");
            Estudiante cat11 = new Estudiante(null, "Computadoras");
            Estudiante cat12 = new Estudiante(null, "Celulares");
            Estudiante cat13 = new Estudiante(null, "Física");
            Estudiante cat14 = new Estudiante(null, "Jardín");
            Estudiante cat15 = new Estudiante(null, "Bebidas");
            Estudiante cat16 = new Estudiante(null, "Joyería");
            Estudiante cat17 = new Estudiante(null, "Videojuegos");
            Estudiante cat18 = new Estudiante(null, "Papelería");
            Estudiante cat19 = new Estudiante(null, "Cine y TV");
            Estudiante cat20 = new Estudiante(null, "Cuidado Personal");

            // Guardar en la base de datos
            estudianteRepository.save(cat1);
            estudianteRepository.save(cat2);
            estudianteRepository.save(cat3);
            estudianteRepository.save(cat4);
            estudianteRepository.save(cat5);
            estudianteRepository.save(cat6);
            estudianteRepository.save(cat7);
            estudianteRepository.save(cat8);
            estudianteRepository.save(cat9);
            estudianteRepository.save(cat10);
            estudianteRepository.save(cat11);
            estudianteRepository.save(cat12);
            estudianteRepository.save(cat13);
            estudianteRepository.save(cat14);
            estudianteRepository.save(cat15);
            estudianteRepository.save(cat16);
            estudianteRepository.save(cat17);
            estudianteRepository.save(cat18);
            estudianteRepository.save(cat19);
            estudianteRepository.save(cat20);

            System.out.println("✅ Datos de categorías insertadas correctamente.");
        }  else {
            System.out.println("Las categoria ya existen, no se insertaron datos.");
        }

    }
}
