package com.mycompany.mywebapp.user;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;




@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(nullable = false,unique = true,length = 45)
    private String email;

    @Column(nullable = false,unique = true)
    private String password;

    @Column(length = 45, nullable = false ,name = "first_name")
    private String firstName;

    @Column(length = 45, nullable = false ,name = "last_name")
    private String lastName;



}
