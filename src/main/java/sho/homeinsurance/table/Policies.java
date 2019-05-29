package sho.homeinsurance.table;

import java.sql.Date;

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
@Table(name="POLICIES")
public class Policies {

	
	@Id
	@Column(name="POLICY_ID", nullable=false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pol_gen")
	@SequenceGenerator(name="pol_gen", sequenceName="pol_id_seq")
	private Integer id=-1;
	
	@Column(name="EFFECTIVE_DATE",nullable=false)
	private Date effectiveDate=null;
	
	@Column(name="END_DATE",nullable=false)
	private Date endDate=null;
	
	@Column(name="TERM",nullable=false)
	private Integer term=0;
	
	@Column(name="POLICY_STATUS", nullable=false)
	private String policyStatus="active";
	
	@MapsId
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="QUOTE_ID",nullable=false,unique=true)
	private Quotes polQuotes= null;
	
	@MapsId
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USERS_ID",nullable=false)
	private Users polUsers=null;

	public Policies()
	{
		
	}
	
	public Policies(Integer policyId, Date effectiveDate, Date endDate, Integer term, String policyStatus,
			Quotes polQuotes, Users polUsers) {
		this.id = policyId;
		this.effectiveDate = effectiveDate;
		this.endDate = endDate;
		this.term = term;
		this.policyStatus = policyStatus;
		this.polQuotes = polQuotes;
		this.polUsers = polUsers;
	}

	public Integer getPolicyId() {
		return id;
	}

	public void setPolicyId(Integer policyId) {
		this.id = policyId;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public Quotes getPolQuotes() {
		return polQuotes;
	}

	public void setPolQuotes(Quotes polQuotes) {
		this.polQuotes = polQuotes;
	}

	public Users getPolUsers() {
		return polUsers;
	}

	public void setPolUsers(Users polUsers) {
		this.polUsers = polUsers;
	}
	
}
