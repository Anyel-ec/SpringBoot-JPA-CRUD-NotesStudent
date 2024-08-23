package top.anyel.relations.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.relations.models.AppEstudianteNotas;
import top.anyel.relations.repositories.AppEstudianteRepository;

import java.util.List;

@Service
public class AppEstudianteService {
    @Autowired
    AppEstudianteRepository appEstudianteRepository;

    public AppEstudianteNotas saveEstudiante(AppEstudianteNotas appEstudiante) {
        appEstudiante.setAppCalificacionUnidad(
                (appEstudiante.getAppLaboratorios()/3) +
                        (appEstudiante.getAppDeberes()/2) +
                        (appEstudiante.getAppTalleres()/3) +
                        (appEstudiante.getAppEvaluacionParcial()/5) +
                        (appEstudiante.getAppExamen() / 7)
        );
        return appEstudianteRepository.save(appEstudiante);
    }

    public long countEstudiantesConNotas() {
        return appEstudianteRepository.countEstudiantesConNotas();
    }

    public List<AppEstudianteNotas> getEstudiantesConCalificacionMayorIgual(int calificacion) {
        return appEstudianteRepository.findByAppCalificacionUnidadGreaterThanEqual(calificacion);
    }

    public List<AppEstudianteNotas> getEstudiantesConCalificacionMenor(int calificacion) {
        return appEstudianteRepository.findByAppCalificacionUnidadLessThan(calificacion);
    }

    public List<AppEstudianteNotas> getEstudiantesPorRango(int min, int max) {
        return appEstudianteRepository.findByCalificacionUnidadBetween(min, max);
    }

}
