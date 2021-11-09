package com.revature.models;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@Table(name="spaceship")
public class Spaceship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ss_id", updatable = false)
    private int ssID;

    @Column(name = "type_of_spaceship", columnDefinition = "varchar(25)")
    private String typeOfSpaceship;

    @Column(name = "ss_name", columnDefinition = "varchar(25)")
    private String ssName;

    @Column(name = "num_seats", columnDefinition = "numeric(3,0)")
    private int numSeats;

}
