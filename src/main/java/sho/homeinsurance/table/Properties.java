package sho.homeinsurance.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PROPERTY")
public class Properties {

	@Id
	@Column(name="rowNum")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="row_gen2")
	@SequenceGenerator(name="row_gen2",sequenceName="row_seq2",
	allocationSize=1)
	private Integer rowNum=-1;
	
	@Column(name="MARKET_VALUE",nullable=false)
	private Integer marketValue=0;
	
	@Column(name="YEAR_BUILT",nullable=false)
	private Integer yearBuilt=-1;
	
	@Column(name="SQUARE_FOOTAGE",nullable=false)
	private Integer squareFootage=0;
	
	@Column(name="DWELLING_TYPE",nullable=false)
	private String dwellingType="";
	
	@Column(name="ROOF_MATERIAL",nullable=false)
	private String roofMaterial="";
	
	@Column(name="HALF_BATHS", nullable=false)
	private Integer halfBaths=0;
	
	@Column(name="FULL_BATHS", nullable=false)
	private Integer fullBaths=0;
	
	@Column(name="POOL",nullable=false)
	private Integer pool=0;
	
	@MapsId
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="LOCATION_ID",nullable=false)
	private Locations locProp=null;

	public Properties()
	{
		
	}
	
	public Properties(Integer marketValue, Integer yearBuilt, Integer squareFootage,
			String dwellingType, String roofMaterial, Integer halfBaths, Integer fullBaths, Integer pool,
			Integer locId) {
		this.marketValue = marketValue;
		this.yearBuilt = yearBuilt;
		this.squareFootage = squareFootage;
		this.dwellingType = dwellingType;
		this.roofMaterial = roofMaterial;
		this.halfBaths = halfBaths;
		this.fullBaths = fullBaths;
		this.pool = pool;
		this.locProp=new Locations(locId);
	}

	public Integer getRowNum() {
		return rowNum;
	}

	public void setRowNum(Integer rowNum) {
		this.rowNum = rowNum;
	}

	public Integer getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(Integer marketValue) {
		this.marketValue = marketValue;
	}

	public Integer getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(Integer yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public Integer getSquareFootage() {
		return squareFootage;
	}

	public void setSquareFootage(Integer squareFootage) {
		this.squareFootage = squareFootage;
	}

	public String getDwellingType() {
		return dwellingType;
	}

	public void setDwellingType(String dwellingType) {
		this.dwellingType = dwellingType;
	}

	public String getRoofMaterial() {
		return roofMaterial;
	}

	public void setRoofMaterial(String roofMaterial) {
		this.roofMaterial = roofMaterial;
	}

	public Integer getHalfBaths() {
		return halfBaths;
	}

	public void setHalfBaths(Integer halfBaths) {
		this.halfBaths = halfBaths;
	}

	public Integer getFullBaths() {
		return fullBaths;
	}

	public void setFullBaths(Integer fullBaths) {
		this.fullBaths = fullBaths;
	}

	public Integer getPool() {
		return pool;
	}

	public void setPool(Integer pool) {
		this.pool = pool;
	}

	public Locations getLocProp() {
		return locProp;
	}

	public void setLocProp(Locations locProp) {
		this.locProp = locProp;
	}


	
}
