package com.projectcard.card.repository;



import com.projectcard.card.entity.CardsDTO;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface RepositoryCardsUsage  extends PagingAndSortingRepository<CardsDTO, Integer> {

//    List<CardsDTO> findByNameOfCard(String nameOfCard);

    CardsDTO findByNameOfCard(String nameOfCard);

    void deleteById(Integer id);

    Optional<CardsDTO> findById(Integer id);
}