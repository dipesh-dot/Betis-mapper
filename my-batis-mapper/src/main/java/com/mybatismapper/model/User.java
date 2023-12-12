package com.mybatismapper.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_tb_seq_gen")
    @SequenceGenerator(name =  "user_tb_seq_gen",sequenceName =  "user_tb_seq",allocationSize = 1)
    private Long id;
    private String name;
    private String address;
}
