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
public class WishList {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Wishid", nullable = false)
    private Integer Wishid;
    private Long userID;
    private String productName;
    private String category;
    private Long price;
}
