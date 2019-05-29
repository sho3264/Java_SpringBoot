package sho.homeinsurance.repository;

import org.springframework.data.repository.CrudRepository;

import sho.homeinsurance.table.Users;

public interface UsersRepository extends CrudRepository<Users,Integer> {

	public Users findByUsername(String name);
	
}
