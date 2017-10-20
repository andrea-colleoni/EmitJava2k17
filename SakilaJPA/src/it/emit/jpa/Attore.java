package it.emit.jpa;


import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="actor")
public class Attore {
	
	@Id
	@Column(name="actor_id")
	private int id;
	
	@Column(name="first_name")
	private String nome;
	
	@Column(name="last_name")
	private String cognome;
	
	@Column(name="last_update")
	private Date ultimoAggiornamento;
	
	@ManyToMany
	@JoinTable(name="film_actor", 
	joinColumns= {
		@JoinColumn(name="actor_id", referencedColumnName="actor_id")	
	},
	inverseJoinColumns= {
		@JoinColumn(name="film_id", referencedColumnName="film_id")
	})
	private List<Film> carriera;
	
	public List<Film> getCarriera() {
		return carriera;
	}
	public void setCarriera(List<Film> carriera) {
		this.carriera = carriera;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getUltimoAggiornamento() {
		return ultimoAggiornamento;
	}
	public void setUltimoAggiornamento(Date ultimoAggiornamento) {
		this.ultimoAggiornamento = ultimoAggiornamento;
	}
	
	

}
