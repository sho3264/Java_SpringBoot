package sho.homeinsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sho.homeinsurance.repository.PoliciesRepository;
import sho.homeinsurance.table.Policies;

@Service
public class PoliciesBusinessService {

	@Autowired
	private PoliciesRepository polRep;
	
	public Policies getPoliciesByPolicyId(Integer id)
	{
		return polRep.findOne(id);
	}
	
	public Policies getPoliciesByQuoteId(Integer quoteId)
	{
		return polRep.findByPolQuotesId(quoteId);
	}
	
	public List<Policies> getPoliciesByUserId(Integer userId)
	{
		return polRep.findByPolUsersId(userId);
	}
}

