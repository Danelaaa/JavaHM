package ge.ibsu.demo.entities;

import jakarta.persistence.GenerationType;

public @interface GeneratedValue {

    GenerationType strategy();

}
