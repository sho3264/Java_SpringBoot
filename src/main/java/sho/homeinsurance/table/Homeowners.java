package sho.homeinsurance.table;

import java.sql.Date;
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
@Table(name="HOMEOWNERS")
public class Homeowners {

	@Id
	@Column(name="ROW_NUM",nullable=false,unique=true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="row_gen")
	@SequenceGenerator(name="row_gen",sequenceName="row_seq",
	allocationSize=1)
	private Integer rowNum=-1;

	@Column(name="FIRST_NAME",nullable=false)
	private String firstName="";

	@Column(name="LAST_NAME", nullable=false)
	private String lastName="";

	@Column(name="DOB", nullable=false)
	private Date dob= null;

	@Column(name="RETIRED_STATUS",nullable=false)
	private Integer retiredStatus=1;

	@Column(name="SSN",nullable=false)
	private String ssn="";

	@Column(name="EMAIL", nullable=false)
	private String email="";

	@MapsId
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USERS_ID",nullable=false,unique=true)
	private Users hmUsers=null;

	public Homeowners()
	{

	}



	public Homeowners(String firstName, String lastName, Date dob, Integer retiredStatus, String ssn,
			String email, Users users) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.retiredStatus = retiredStatus;
		this.ssn = ssn;
		this.email = email;
		this.hmUsers = users;
	}


	public Integer getRowNum() {
		return rowNum;
	}


	public void setRowNum(Integer rowNum) {
		this.rowNum = rowNum;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Integer getRetiredStatus() {
		return retiredStatus;
	}

	public void setRetiredStatus(Integer retiredStatus) {
		this.retiredStatus = retiredStatus;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Users getUsers() {
		return hmUsers;
	}

	public void setUsers(Users users) {
		this.hmUsers = users;
	}


}
