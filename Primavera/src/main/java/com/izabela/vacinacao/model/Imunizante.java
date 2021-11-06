package com.izabela.vacinacao.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "tb_imunizante")
public class Imunizante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_imunizante")
	private Long id;
	
	@Column(name = "qtd_lote")
	private Integer lote;
	
	@ManyToMany
    @JoinTable(name="tb_imunizante_localidade", joinColumns=
    {@JoinColumn(name="cd_imunizante")}, inverseJoinColumns=
      {@JoinColumn(name="cd_localidade")})
    private List<Localidade> localidades = new ArrayList<Localidade>();
}
