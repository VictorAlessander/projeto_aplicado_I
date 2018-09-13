package br.com.agenda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(exclude= { "contato" })
@Entity
@Table(name="telefones")
public class Telefone {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String ddd;
	
	@Column
	private String numero;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="contato_id", nullable=false)
	private Contato contato;

}
