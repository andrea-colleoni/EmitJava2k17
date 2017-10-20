package it.emit.jpa;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Film {
	
	@Id
	@Column(name="film_id")
	private int id;
	
	private String title;
	private String description;
	
	@Column(name="release_year")
	private int annoPubblicazione;
	
	@ManyToMany(mappedBy="carriera")
	private List<Attore> cast;
	
	public List<Attore> getCast() {
		return cast;
	}
	public void setCast(List<Attore> cast) {
		this.cast = cast;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}
	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}
	
	

}
