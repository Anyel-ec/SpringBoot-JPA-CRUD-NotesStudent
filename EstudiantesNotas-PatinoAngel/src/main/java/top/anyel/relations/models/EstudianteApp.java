package top.anyel.relations.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class EstudianteApp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    @OneToMany
    private List<AppEstudianteNotas> notasAppd;

    // un estudiante tendra varias notas
}
