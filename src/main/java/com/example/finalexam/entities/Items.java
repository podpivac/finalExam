package com.example.finalexam.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Items {

    @Id
    @Column(length = 25, name = "Catcode")
    private String catCode;

    @Column(length = 25, name = "Icode")
    private String iCode;

    @Column(length = 25, name = "Idesc")
    private String iDesc;

    @Column(name = "Price")
    private double price;

}
