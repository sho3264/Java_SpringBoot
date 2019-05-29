package sho.homeinsurance.table;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class Users {

	@Id
	@Column(name="USER_ID", nullable=false, unique=true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user_gen")
	@SequenceGenerator(name="user_gen", sequenceName="user_seq",
	allocationSize=1)
	Integer id=-1;
	
	@Column(name="USERNAME", nullable=false, unique=true)
	String username="";
	
	@Column(name="PASSWORD",nullable=false)
	String password="";
	
	@Column(name="ADMIN_ROLE", nullable=false)
	String adminRole="user";
	
	@OneToOne(mappedBy="hmUsers",cascade=CascadeType.ALL,
			orphanRemoval=true)
	private Homeowners hmUsers = null;
	
	@OneToMany(mappedBy="locUsers",cascade=CascadeType.ALL,
			orphanRemoval=true)
	private List<Locations> locUsers= new ArrayList<>();
	
	@OneToMany(mappedBy="polUsers",cascade=CascadeType.ALL,
			orphanRemoval=true)
	private List<Policies> polUsers = new ArrayList<>();
	
	public Users()
	{
		
	}
	
	public Users(String username,String password)
	{
		this.username=username;
		this.password=password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdminRole() {
		return adminRole;
	}

	public void setAdminRole(String adminRole) {
		this.adminRole = adminRole;
	}
	
	
	
	
}
