package com.izabela.vacinacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter 
@Setter
@Entity 
@Table(name = "tb_localidade")
public class Localidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_localidade")
	private Long id;
	
	@Column(name = "nm_cidade")
	private Integer cidade;
	
	@Column(name = "nm_bairro")
	private Integer bairro;
}
