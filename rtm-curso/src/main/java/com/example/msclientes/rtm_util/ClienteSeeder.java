package com.example.msclientes.rtm_util;

import com.example.msclientes.rtm_entity.Curso;
import com.example.msclientes.rtm_repository.CursoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ClienteSeeder implements CommandLineRunner {
    private final CursoRepository cursoRepository;

    public ClienteSeeder(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public void run(String... args) {
        // Eliminar todos los pedidos (opcional)
        // clienteRepository.deleteAll();

        if (cursoRepository.count() == 0) { // Verifica si la tabla está vacía
            // Crear 5 objetos de pedidos con el constructor adecuado
            Curso curso1 = new Curso(null, "Matemáticas", "CUR001", LocalDateTime.now().minusDays(1));
            Curso curso2 = new Curso(null, "Física", "CUR002", LocalDateTime.now().minusDays(2));
            Curso curso3 = new Curso(null, "Química", "CUR003", LocalDateTime.now().minusDays(3));
            Curso curso4 = new Curso(null, "Historia", "CUR004", LocalDateTime.now().minusDays(4));
            Curso curso5 = new Curso(null, "Lenguaje", "CUR005", LocalDateTime.now().minusDays(5));

// Guardar en la base de datos
            cursoRepository.save(curso1);
            cursoRepository.save(curso2);
            cursoRepository.save(curso3);
            cursoRepository.save(curso4);
            cursoRepository.save(curso5);


            System.out.println("✅ Datos de pedidos insertados correctamente.");
        } else {
            System.out.println("Los pedidos ya existen, no se insertaron datos.");
        }
    }
}
