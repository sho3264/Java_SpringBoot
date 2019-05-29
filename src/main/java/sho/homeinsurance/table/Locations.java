package sho.homeinsurance.table;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="LOCATIONS")
public class Locations {

	@Id
	@Column(name="LOCATION_ID", nullable=false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="loc_gen")
	@SequenceGenerator(name="loc_gen",sequenceName="loc_seq", 
	allocationSize=1)
	private Integer id=-1;
	
	@Column(name="RESIDENCE_TYPE",nullable=false)
	private String residenceType="";
	
	@Column(name="ADDRESS_LINE_1",nullable=false)
	private String addressLine1="";
	
	@Column(name="ADDRESS_LINE_2")
	private String addressLine2="";
	
	@Column(name="CITY",nullable=false)
	private String city="";
	
	@Column(name="LOCATION_STATE",nullable=false)
	private String state="";
	
	@Column(name="ZIP_CODE",nullable=false)
	private String zipCode="";
	
	@Column(name="RESIDENCE_USE",nullable=false)
	private String residenceUse="";
	
	@MapsId
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USERS_ID",nullable=false)
	private Users locUsers=null;
	
	@OneToOne(mappedBy="locProp", cascade=CascadeType.ALL, 
			orphanRemoval=true)
	private Properties locProp = null;
	
	@OneToOne(mappedBy="locQuote", cascade=CascadeType.ALL, 
			orphanRemoval=true)
	private Quotes locQuote=null;
	
	public Locations()
	{
		
	}
	
	public Locations(Integer locationId)
	{
		this.id=locationId;
	}

	public Locations(Integer locationId, String residenceType, String addressLine1, String addressLine2, String city,
			String state, String zipCode, String residenceUse, Users user) {

		this.id = locationId;
		this.residenceType = residenceType;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.residenceUse = residenceUse;
		this.locUsers = user;
	}

	public Integer getLocationId() {
		return id;
	}

	public void setLocationId(Integer locationId) {
		this.id = locationId;
	}

	public String getResidenceType() {
		return residenceType;
	}

	public void setResidenceType(String residenceType) {
		this.residenceType = residenceType;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getResidenceUse() {
		return residenceUse;
	}

	public void setResidenceUse(String residenceUse) {
		this.residenceUse = residenceUse;
	}

	public Users getUser() {
		return locUsers;
	}

	public void setUser(Users user) {
		this.locUsers = user;
	}

	public Users getLocUsers() {
		return locUsers;
	}

	public void setLocUsers(Users locUsers) {
		this.locUsers = locUsers;
	}


}
