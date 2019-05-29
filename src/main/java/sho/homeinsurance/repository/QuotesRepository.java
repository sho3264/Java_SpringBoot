package sho.homeinsurance.repository;

import org.springframework.data.repository.CrudRepository;

import sho.homeinsurance.table.Quotes;

public interface QuotesRepository extends CrudRepository<Quotes, Integer> {


	public Quotes findByLocQuoteId(Integer locId);

}
