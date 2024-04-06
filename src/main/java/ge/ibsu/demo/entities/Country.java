package ge.ibsu.demo.entities;

import jakarta.persistence.GenerationType;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
