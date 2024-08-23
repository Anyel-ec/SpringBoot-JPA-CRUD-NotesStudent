package top.anyel.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.anyel.mongo.collections.NumeroApp;
import top.anyel.mongo.services.NumeroServiceApp;

import java.util.List;

@RestController
public class NumeroControllerApp {
    @Autowired
    private NumeroServiceApp numeroServiceApp;

    @PostMapping("/api/appd/numeros")
    public List<NumeroApp> guardarNumeros(@RequestParam int limiteApp) {
        return numeroServiceApp.calcularNumeros(limiteApp);
    }
}