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
import java.util.ArrayList;
import java.util.List;
@Document
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Rol implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String rol;
	@JsonIgnore
	private List<Socio> socios = new ArrayList<>();
}