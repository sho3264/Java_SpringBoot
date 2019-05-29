package sho.homeinsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sho.homeinsurance.repository.LocationsRepository;
import sho.homeinsurance.table.Locations;

@Service
public class LocationsBusinessService {

	@Autowired
	private LocationsRepository locRep;
	
	public Locations getLocationsByLocationId(Integer locId)
	{
		return locRep.findOne(locId);
	}
	
	public List<Locations> getLocationsByUserId(Integer userId)
	{	
		return locRep.findByLocUsersId(userId);
	}
	
	
	public void addLocations(Locations loc)
	{
		locRep.save(loc);
	}
	
}
