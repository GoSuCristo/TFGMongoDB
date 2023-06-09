package com.gosucristo.TFG.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Document
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Socio implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    private ObjectId _id;
    private String nombre;
    private String email;
    private String das;
    private String password;
    private boolean activado;
    @JsonIgnore
    private Rol rol;
    private List<Progreso> progresos = new ArrayList<>();
    private List<Suscripcion> suscripciones = new ArrayList<>();

}
