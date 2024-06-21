package ch.noseryoung.rest_food.domain.menucard;

import ch.noseryoung.rest_food.domain.menucard.menucarditem.MenucardItem;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "menucard")
public class Menucard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menucardId;


    @Column(name = "name", nullable = false)
    @Size(min= 5, max = 25)
    private String name;


    /*@ManyToOne(fetch = FetchType.EAGER)
    JoinColumn(name = )
    */
}