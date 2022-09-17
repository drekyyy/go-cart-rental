package com.example.gocart.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Gocart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long gocartId;

    @Column
    public int seats;

    @Column
    public String color;



}
