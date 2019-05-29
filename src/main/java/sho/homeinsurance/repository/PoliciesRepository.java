package sho.homeinsurance.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import sho.homeinsurance.table.Policies;

public interface PoliciesRepository extends CrudRepository<Policies, Integer> {

	public Policies findByPolQuotesId(Integer quoteId);
	
	public List<Policies> findByPolUsersId(Integer userId);
}
