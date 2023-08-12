package com.example.finalexam.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sales")
public class Sales {

    @Id
    private BigInteger id;

    @Column(length = 25, name = "recno")
    private String recNo;

    @Column(length = 25, name = "icode")
    private String icoDe;

    @Column(length = 25, name = "qty")
    private String quantity;

    @Column(length = 25, nullable = true, name = "dot")
    private String dote;

}