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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Store;

/**
 * Information generated by hbm2java
 */
@XmlRootElement(name = "information")
@Entity
@Table(name = "INFORMATION")
@XmlAccessorType(XmlAccessType.NONE)
@Indexed
public class Information {

	@XmlElement(name = "id")
	private int id;
	private Partner partner;
	@XmlElement(name = "hotline")
	private String hotline;
	@XmlElement(name = "name")
	private String name;

	private String timeopen;

	private String timeclose;
	@XmlElement(name = "type")
	private String type;
	@XmlElement(name = "intro")
	private String intro;
	@XmlElement(name = "number")
	private String number;
	@XmlElement(name = "ward")
	private String ward;
	@XmlElement(name = "street")
	private String street;
	@XmlElement(name = "district")
	private String district;
	@XmlElement(name = "province")
	private String province;
	@XmlElement(name = "urlpartner")
	private String urlpartner;

	@XmlElement(name = "images")
	public Set<Image> images = new HashSet<Image>(0);
	private Set<Users> userses = new HashSet<Users>(0);

	private Set<Service> services = new HashSet<Service>(0);

	private Set<Room> rooms = new HashSet<Room>(0);
	private Set<Food> foods = new HashSet<Food>(0);

	public Information() {
	}

	/*
	 * public Information(int id, Partner partner, String hotline, String name,
	 * String timeopen, String timeclose, String type, String intro, String
	 * number, String ward, String street, String district, String province) {
	 * this.id = id; this.partner = partner; this.hotline = hotline; this.name =
	 * name; this.timeopen = timeopen; this.timeclose = timeclose; this.type =
	 * type; this.intro = intro; this.number = number; this.ward = ward;
	 * this.street = street; this.district = district; this.province = province;
	 * }
	 * 
	 * public Information(int id, Partner partner, String hotline, String name,
	 * String timeopen, String timeclose, String type, String intro, String
	 * number, String ward, String street, String district, String province,
	 * String urlpartner, Set<Image> images, Set<Users> userses, Set<Service>
	 * services, Set<Room> rooms, Set<Food> foods) { this.id = id; this.partner
	 * = partner; this.hotline = hotline; this.name = name; this.timeopen =
	 * timeopen; this.timeclose = timeclose; this.type = type; this.intro =
	 * intro; this.number = number; this.ward = ward; this.street = street;
	 * this.district = district; this.province = province; this.urlpartner =
	 * urlpartner; this.images = images; this.userses = userses;
	 * 
	 * this.services = services;
	 * 
	 * this.rooms = rooms; this.foods = foods;
	 * 
	 * }
	 */

	@Id

	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "partner", nullable = false)

	public Partner getPartner() {
		return this.partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	@Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
	@Column(name = "hotline", nullable = false)
	public String getHotline() {
		return this.hotline;
	}

	public void setHotline(String hotline) {
		this.hotline = hotline;
	}

	@Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * @Field(index = Index.YES, analyze = Analyze.NO, store = Store.YES)
	 * 
	 * @DateBridge(resolution = Resolution.DAY)
	 * 
	 * @Temporal(TemporalType.TIME)
	 */
	@XmlElement(name = "timeopen")
	@Column(name = "timeopen", nullable = false, length = 5)
	public String getTimeopen() {
		// SimpleDateFormat localDateFormat = new SimpleDateFormat("HH:mm:ss");
		// try {
		// timeopen= localDateFormat.parse(timeopen.toString());
		// } catch (ParseException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		String string = timeopen;
		String[] parts = string.split(":");
		String part1 = parts[0];
		String part2 = parts[1];
		timeopen = part1 + ":" + part2;
		return timeopen;
	}

	public void setTimeopen(String timeopen) {
		this.timeopen = timeopen;
	}

	/*
	 * @Field(index = Index.YES, analyze = Analyze.NO, store = Store.YES)
	 * 
	 * @DateBridge(resolution = Resolution.DAY)
	 * 
	 * @Temporal(TemporalType.TIME)
	 */
	@XmlElement(name = "timeclose")
	@Column(name = "timeclose", nullable = false, length = 5)
	public String getTimeclose() {
		// SimpleDateFormat localDateFormat = new SimpleDateFormat("HH:mm");
		// try {
		// timeclose = localDateFormat.parse(timeclose.toString());
		// } catch (ParseException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		String string = timeclose;
		String[] parts = string.split(":");
		String part1 = parts[0];
		String part2 = parts[1];
		timeclose = part1 + ":" + part2;
		return timeclose;
	}

	public void setTimeclose(String timeclose) {
		this.timeclose = timeclose;
	}

	@Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
	@Column(name = "type", nullable = false)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
	@Column(name = "intro", nullable = false)
	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	@Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
	@Column(name = "number", nullable = false)
	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
	@Column(name = "ward", nullable = false)
	public String getWard() {
		return this.ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	@Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
	@Column(name = "street", nullable = false)
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
	@Column(name = "district", nullable = false)
	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
	@Column(name = "province", nullable = false)
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
	@Column(name = "urlpartner")
	public String getUrlpartner() {
		return this.urlpartner;
	}

	public void setUrlpartner(String urlpartner) {
		this.urlpartner = urlpartner;
	}

	@Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "information")
	public Set<Image> getImages() {
		return this.images;
	}

	public void setImages(Set<Image> images) {
		this.images = images;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "RATING", joinColumns = {
			@JoinColumn(name = "infor", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "users", nullable = false, updatable = false) })
	public Set<Users> getUserses() {
		return this.userses;
	}

	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "SERVICEINFOR", joinColumns = {
			@JoinColumn(name = "information", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "service", nullable = false, updatable = false) })
	public Set<Service> getServices() {
		return this.services;
	}

	public void setServices(Set<Service> services) {
		this.services = services;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "information")
	public Set<Room> getRooms() {
		return this.rooms;
	}

	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "information")
	public Set<Food> getFoods() {
		return this.foods;
	}

	public void setFoods(Set<Food> foods) {
		this.foods = foods;
	}

}
