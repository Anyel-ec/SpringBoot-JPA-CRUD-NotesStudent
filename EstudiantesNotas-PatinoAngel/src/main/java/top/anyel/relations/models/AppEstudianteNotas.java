package top.anyel.relations.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AppEstudianteNotas {
    @Id
    @GeneratedValue()
    private Long id;

    private Double appLaboratorios;
    private Double appDeberes;
    private Double appTalleres;
    private Double appEvaluacionParcial;
    private Double appExamen;
    private Double appCalificacionUnidad;
}
