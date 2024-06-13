package ch.noseryoung.rest_food.domain.menucard;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class MenucardItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "chefsChoice", nullable = false)
    private Boolean chefsChoice;

    @ManyToOne
    @JoinColumn(name = "menucard_id", nullable = false)
    private Menucard menucard;
}
