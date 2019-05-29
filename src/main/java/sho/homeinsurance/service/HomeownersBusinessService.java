package sho.homeinsurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sho.homeinsurance.repository.HomeownersRepository;
import sho.homeinsurance.table.Homeowners;


@Service
public class HomeownersBusinessService {

	@Autowired
	private HomeownersRepository hmRep;
	
	public Homeowners getHomeownersByUserId(Integer userId)
	{
		return hmRep.findByHmUsersId(userId);
	}
	
	public void addHomeowners(Homeowners hm)
	{
		hmRep.save(hm);
	}
	
}
