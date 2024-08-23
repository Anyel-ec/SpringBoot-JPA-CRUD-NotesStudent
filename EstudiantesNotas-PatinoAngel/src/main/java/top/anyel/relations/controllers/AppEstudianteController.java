package top.anyel.relations.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.anyel.relations.models.AppEstudianteNotas;
import top.anyel.relations.services.AppEstudianteService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appd")
public class AppEstudianteController {
    @Autowired
    private AppEstudianteService appEstudianteService;

    @PostMapping("/guardar")
    public ResponseEntity<AppEstudianteNotas> createEstudiante(@RequestBody AppEstudianteNotas appEstudiante) {
        return new ResponseEntity<>(appEstudianteService.saveEstudiante(appEstudiante), HttpStatus.CREATED);
    }

    @GetMapping("/count")
    public ResponseEntity<Long> countEstudiantesConNotas() {
        return new ResponseEntity<>(appEstudianteService.countEstudiantesConNotas(), HttpStatus.OK);
    }

    @GetMapping("/calificacionMayorIgual/{calificacion}")
    public ResponseEntity<List<AppEstudianteNotas>> getEstudiantesConCalificacionMayorIgual(@PathVariable int calificacion) {
        return new ResponseEntity<>(appEstudianteService.getEstudiantesConCalificacionMayorIgual(calificacion), HttpStatus.OK);
    }

    @GetMapping("/calificacionMenor/{calificacion}")
    public ResponseEntity<List<AppEstudianteNotas>> getEstudiantesConCalificacionMenor(@PathVariable int calificacion) {
        return new ResponseEntity<>(appEstudianteService.getEstudiantesConCalificacionMenor(calificacion), HttpStatus.OK);
    }

    @GetMapping("/rango")
    public ResponseEntity<List<AppEstudianteNotas>> getEstudiantesPorRango(@RequestParam int minApp, @RequestParam int maxApp) {
        return new ResponseEntity<>(appEstudianteService.getEstudiantesPorRango(minApp, maxApp), HttpStatus.OK);
    }
}