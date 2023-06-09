package com.gosucristo.TFG.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
@Document
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Suscripcion implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private LocalDate f_inicio;
	private LocalDate f_fin;
	@JsonIgnore
	private Socio socio;
	@JsonIgnore
	private TipoSuscripcion tiposuscripcion;
}