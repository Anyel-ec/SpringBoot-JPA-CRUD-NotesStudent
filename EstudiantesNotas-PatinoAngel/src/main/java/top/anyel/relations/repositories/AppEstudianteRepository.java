package top.anyel.relations.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import top.anyel.relations.models.AppEstudianteNotas;

import java.util.List;

@Repository
public interface AppEstudianteRepository  extends JpaRepository<AppEstudianteNotas, Long> {

    @Query("SELECT COUNT(e) FROM AppEstudianteNotas e WHERE e.appLaboratorios > 0 OR e.appDeberes > 0 OR e.appTalleres > 0 OR e.appEvaluacionParcial > 0 OR e.appExamen > 0")
    long countEstudiantesConNotas();

    List<AppEstudianteNotas> findByAppCalificacionUnidadGreaterThanEqual(int calificacion);

    List<AppEstudianteNotas> findByAppCalificacionUnidadLessThan(int calificacion);

    @Query("SELECT e FROM AppEstudianteNotas e WHERE e.appCalificacionUnidad BETWEEN :min AND :max")
    List<AppEstudianteNotas> findByCalificacionUnidadBetween(@Param("min") int min, @Param("max") int max);
}
