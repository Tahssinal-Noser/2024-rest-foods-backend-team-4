package ch.noseryoung.rest_food.domain.menucard.menucarditem;

import ch.noseryoung.rest_food.domain.menucard.Menucard;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name ="MenucardItem")
public class MenucardItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menucarditemId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name= "image", nullable = false)
    private String image;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "chefs_choice", nullable = false)
    private Boolean chefsChoice;


}
