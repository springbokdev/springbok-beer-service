package space.springbok.beerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import space.springbok.beerservice.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}
