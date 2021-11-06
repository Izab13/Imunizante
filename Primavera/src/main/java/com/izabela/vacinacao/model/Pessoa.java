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
@Table(name = "tb_pessoas")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_pessoas")
	private Long id;
	
	@Column(name = "im_primeiraDose")
	private Imunizante imuPrimeiraDose;
	
	@Column(name = "im_segundaDose")
	private Imunizante imuSegundaDose;  
	
	@Column(name = "lc_primeiraDose")
	private Localidade locPrimeiraDose; 
	
	@Column(name = "lc_segundaDose")
	private Localidade locSegundaDose; 
}
