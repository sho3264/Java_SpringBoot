package sho.homeinsurance.table;

import javax.persistence.CascadeType;
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
@Table(name="QUOTES")
public class Quotes {

	@Id
	@Column(name="QUOTE_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="quote_gen")
	@SequenceGenerator(name="quote_gen",sequenceName="quote_id_sequence",
	allocationSize=1)
	private Integer id=-1;
	
	@Column(name="MONTHLY_PREMIUM",nullable=false)
	private Float monthlyPremium=0f;
	
	@Column(name="DWELLING_COVERAGE",nullable=false)
	private Float dwellingCoverage=0f;
	
	@Column(name="DETACHED_STRUCTURES", nullable=false)
	private Float detachedStructures=0f;
	
	@Column(name="PERSONAL_PROPERTY", nullable=false)
	private Float personalProperty=0f;
	
	@Column(name="ADD_LIVING_EXPENSE", nullable=false)
	private Float addLivingExpense=0f;
	
	@Column(name="MEDICAL_EXPENSES",nullable=false)
	private Float medicalExpenses=0f;
	
	@Column(name="DEDUCTIBLE", nullable=false)
	private Float deductible=0f;
	
	@MapsId
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="LOCATIONS_ID",nullable=false)
	private Locations locQuote=null;
	
	@OneToOne(mappedBy="polQuotes", cascade= CascadeType.ALL, orphanRemoval=true)
	private Policies polQuotes=null;
	
	
	public Quotes()
	{
		
	}

	public Quotes(Integer quoteId, Float monthlyPremium, Float dwellingCoverage, Float detachedStructures,
			Float personalProperty, Float addLivingExpense, Float medicalExpenses, Float deductible) {
		this.id = quoteId;
		this.monthlyPremium = monthlyPremium;
		this.dwellingCoverage = dwellingCoverage;
		this.detachedStructures = detachedStructures;
		this.personalProperty = personalProperty;
		this.addLivingExpense = addLivingExpense;
		this.medicalExpenses = medicalExpenses;
		this.deductible = deductible;
	}

	public Integer getQuoteId() {
		return id;
	}

	public void setQuoteId(Integer quoteId) {
		this.id = quoteId;
	}

	public Float getMonthlyPremium() {
		return monthlyPremium;
	}

	public void setMonthlyPremium(Float monthlyPremium) {
		this.monthlyPremium = monthlyPremium;
	}

	public Float getDwellingCoverage() {
		return dwellingCoverage;
	}

	public void setDwellingCoverage(Float dwellingCoverage) {
		this.dwellingCoverage = dwellingCoverage;
	}

	public Float getDetachedStructures() {
		return detachedStructures;
	}

	public void setDetachedStructures(Float detachedStructures) {
		this.detachedStructures = detachedStructures;
	}

	public Float getPersonalProperty() {
		return personalProperty;
	}

	public void setPersonalProperty(Float personalProperty) {
		this.personalProperty = personalProperty;
	}

	public Float getAddLivingExpense() {
		return addLivingExpense;
	}

	public void setAddLivingExpense(Float addLivingExpense) {
		this.addLivingExpense = addLivingExpense;
	}

	public Float getMedicalExpenses() {
		return medicalExpenses;
	}

	public void setMedicalExpenses(Float medicalExpenses) {
		this.medicalExpenses = medicalExpenses;
	}

	public Float getDeductible() {
		return deductible;
	}

	public void setDeductible(Float deductible) {
		this.deductible = deductible;
	}

	public Locations getLocQuote() {
		return locQuote;
	}

	public void setLocQuote(Locations locQuote) {
		this.locQuote = locQuote;
	}
	
	
}
