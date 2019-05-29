package sho.homeinsurance.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sho.homeinsurance.repository.UsersRepository;
import sho.homeinsurance.table.Users;

@Service
public class UsersBusinessService {

	
	@Autowired
	private UsersRepository userRep;
	
	public Users getUserByUserName(String name)
	{	
		return userRep.findByUsername(name); 
	}
	
	public void addUsers(Users user)
	{
		userRep.save(user);
	}
	

	
	
}
