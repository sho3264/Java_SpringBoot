package sho.homeinsurance.repository;

import org.springframework.data.repository.CrudRepository;

import sho.homeinsurance.table.Properties;

public interface PropertiesRepository extends CrudRepository<Properties, Integer> {
	
	public Properties findByLocPropId(Integer locId);
}
