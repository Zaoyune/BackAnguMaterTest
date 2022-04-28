package com.example.explastmain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Exp {
    @Id
    @GeneratedValue
    private Long id;
    private String item;
    private double price;
    private String company;
    private int qte;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date date;
    @ManyToOne
    private User user;

 }
