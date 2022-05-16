package com.projectcard.card.entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.bind.annotation.Default;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "GAME_OF_CARDS")
public class CardsDTO {

    @Id
    @GeneratedValue
    private Integer id;

    private String nameOfCard;

    private String edition;

    private String language;

    private Boolean foil;

    private int theAmount;

    private double price;

    public CardsDTO(Object o) {
    }
}
