package sho.homeinsurance.repository;

import org.springframework.data.repository.CrudRepository;

import sho.homeinsurance.table.Homeowners;

public interface HomeownersRepository extends CrudRepository<Homeowners, Integer> {
	
	public Homeowners findByHmUsersId(Integer id);
	
}
