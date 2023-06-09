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
@Document
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Progreso implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private int n_cap_visto;
	@JsonIgnore
	private Socio socio;
	@JsonIgnore
	private Playlist playlist;
}