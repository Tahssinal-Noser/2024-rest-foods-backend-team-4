package ch.noseryoung.rest_food.domain.authority;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "authorities")
@Getter
@Setter
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "authority_id")
    private Integer authorityId;

    @Column(name = "name", unique = true, nullable = false)
    private String name;
}

