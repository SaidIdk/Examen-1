package com.example.mscurso.rtm_entity;


import jakarta.persistence.*;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
public class Curso {
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @Setter
    private String codigo;
    @Setter
    private LocalDateTime fecha;

    public Curso() {
        this.fecha = LocalDateTime.now();
    }

    public Curso(Integer id, String nombre, String codigo, LocalDateTime fecha) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String producto) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
