package sho.homeinsurance.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import sho.homeinsurance.table.Locations;

public interface LocationsRepository extends CrudRepository<Locations, Integer> {

	public List<Locations> findByLocUsersId(Integer userId);
	
}
