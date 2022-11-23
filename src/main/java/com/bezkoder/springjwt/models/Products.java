package com.bezkoder.springjwt.models;


import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table

public class Products {



    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String productName;
    private String date;
    private String place;

    private String category;

    @Lob
    @Column(name = "image",nullable = false)
    private String image;


    private String description;
    private Long price;
    private String ownerName;
    private String emailID;


}
