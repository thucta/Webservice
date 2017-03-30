package entity;
// Generated Mar 24, 2017 7:27:14 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Service generated by hbm2java
 */

@Entity
@Table(name = "SERVICE")
@XmlRootElement(name="service")
@XmlAccessorType(XmlAccessType.NONE)
public class Service {
	@XmlElement(name = "id")
	private int id;
	@XmlElement(name = "name")
	private String name;
	private Set<Information> informations = new HashSet<Information>(0);

	public Service() {
	}

	public Service(int id) {
		this.id = id;
	}

	public Service(int id, String name, Set<Information> informations) {
		this.id = id;
		this.name = name;
		this.informations = informations;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "SERVICEINFOR", joinColumns = {
			@JoinColumn(name = "service", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "information", nullable = false, updatable = false) })
	public Set<Information> getInformations() {
		return this.informations;
	}

	public void setInformations(Set<Information> informations) {
		this.informations = informations;
	}

}
