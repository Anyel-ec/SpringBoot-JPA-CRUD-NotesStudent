package top.anyel.mongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.mongo.collections.NumeroApp;
import top.anyel.mongo.repository.NumeroRepositoryApp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class NumeroServiceApp {
    @Autowired
    private NumeroRepositoryApp numeroRepositoryApp;

    public List<NumeroApp> calcularNumeros(int limite) {
        List<NumeroApp> numeros = new ArrayList<>();
        for (int i = 1; i <= limite; i++) {
            NumeroApp numeroApp = new NumeroApp();
            numeroApp.setNumeroApp(i);
            numeroApp.setEsPrimoAppd(esPrimo(i));
            numeroApp.setFechaHoraAppd(LocalDateTime.now());
            numeroApp.setSecuenciaAppd(i);
            numeros.add(numeroApp);
        }
        return numeroRepositoryApp.saveAll(numeros);
    }

    private boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}