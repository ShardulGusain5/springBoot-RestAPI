package org.shardul.springbootbackend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
//this annotation will internally generate all the getters ,setters and required constructors
@Entity
//this will make this entity a jpa entity
@Table(name ="employees")
//providing table name
public class Employee
{
    @Id
    //making this primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    @Column(name = "first_name",nullable = false)
    private String firstName;
    @Column(name = "last_name",nullable = false)
    private String lastName;
    @Column(name = "email",nullable = false)
    private String email;

}
