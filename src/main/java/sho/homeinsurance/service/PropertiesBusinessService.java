package sho.homeinsurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sho.homeinsurance.repository.PropertiesRepository;
import sho.homeinsurance.table.Properties;

@Service
public class PropertiesBusinessService {

	@Autowired
	private PropertiesRepository propRep;
	
	public Properties getProperties()
	{
		return null;
	}
	
	public void addProperties(Properties prop)
	{
		propRep.save(prop);
	}
	
}
