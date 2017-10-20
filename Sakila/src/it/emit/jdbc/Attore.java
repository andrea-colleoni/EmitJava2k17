package it.emit.jdbc;

import java.sql.Date;

public class Attore {
	
	private int id;
	private String nome;
	private String cognome;
	private Date ultimoAggiornamento;
	
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
