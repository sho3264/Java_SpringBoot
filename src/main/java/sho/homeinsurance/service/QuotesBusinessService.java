package sho.homeinsurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sho.homeinsurance.repository.QuotesRepository;
import sho.homeinsurance.table.Quotes;

@Service
public class QuotesBusinessService {

	@Autowired 
	private QuotesRepository quotesRep;
	
	public Quotes getQuotesByQuoteId(Integer id)
	{
		return quotesRep.findOne(id);
	}
	public Quotes getQuotesByLocationId(Integer locId)
	{
		return quotesRep.findByLocQuoteId(locId);
	}
	
}
