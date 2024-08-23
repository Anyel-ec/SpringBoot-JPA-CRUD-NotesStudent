package top.anyel.mongo.collections;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Data
@Document(collection = "numeros")
public class NumeroApp {


    @Id
    private String id;
    private int numeroApp;
    private boolean esPrimoAppd;
    private LocalDateTime fechaHoraAppd;
    private int secuenciaAppd;

}