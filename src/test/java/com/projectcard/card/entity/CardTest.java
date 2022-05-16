package com.projectcard.card.entity;

import com.projectcard.card.repository.RepositoryCardsUsage;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;



import static org.junit.jupiter.api.Assertions.assertThrows;


@DataJpaTest
@AutoConfigureTestDatabase
public class CardTest {

    @Autowired
    private RepositoryCardsUsage repositoryCardsUsage;

    @Autowired
    private CardsDTO cardsDTO;

    @Test
    public void deveriaRetornarErro() {
        assertThrows(IllegalArgumentException.class,
                () -> new CardsDTO(null));
    }
    @Test
    public void deveriaCriarCards(){
        new CardsDTO(1,"card","ultimate","portuguese",true,12,45433);
    }
}
