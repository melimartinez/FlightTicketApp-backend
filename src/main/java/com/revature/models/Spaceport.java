package com.revature.models;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@Table(name="spaceport")
public class Spaceport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sp_id", updatable = false)
    private int spID;

    @Column(name = "sp_name", columnDefinition = "varchar(25)")
    private String spName;

    @Column(name = "planet", columnDefinition = "varchar(15)")
    private String planet;

}
