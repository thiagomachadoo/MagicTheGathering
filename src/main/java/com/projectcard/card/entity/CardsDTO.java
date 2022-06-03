package com.projectcard.card.entity;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Schema(name = "CardsDTO")
@Entity(name = "GAME_OF_CARDS")
public class CardsDTO {

    @Id
    @GeneratedValue
    private Integer id;

    @Schema(description = "Nome da carta", example = "Raichu GX", required = true)
    private String nameOfCard;

    @Schema(description = "Edição da carta", allowableValues = {"BASIC","PLATINUM","PREMIUM","PREMIUM PLUS"}, example = "PLATINUM", required = true)
    private String edition;

    @Schema(description = "Idioma da carta", allowableValues = "pt-br", required = true)
    private String language;

    @Schema(description = "É uma carta laminada", example = "true", required = true)
    private Boolean foil;

    @Schema(description = "Quantas cartas você tem", example = "426", required = true)
    private int theAmount;

    @Schema(description = "Quanto vale em R$ sua carta", type = "double",example = "54.700", required = true)
    private double price;

    public CardsDTO(Object o) {
    }
}
