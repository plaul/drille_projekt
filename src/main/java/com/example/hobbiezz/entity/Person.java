package com.example.hobbiezz.entity;

import com.example.hobbiezz.dto.PersonRequest;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.HashSet;
import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;


    private String email;
    //@Column(length = 320)


    String firstName;

    String lastName;

    @Column(length = 20)
    String phone;

    public Person(String email, String firstName, String lastName, String phone) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }


    @ManyToOne
    Address connectedAddress;

    /*@OneToMany(mappedBy = "personalAddress", fetch = FetchType.EAGER)
    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)

    private Set<Address> personalAddress = new HashSet<>();

    public void addAddress(Address address){
        personalAddress.add(address);
    }

     */


    public Person(PersonRequest body) {
        this.email = body.getEmail();
        this.firstName = body.getFirstName();
        this.lastName = body.getFirstName();
        this.phone = body.getPhone();
    }


    public Person(String email, String firstName, String lastName, String phone, Address connectedAddress){
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.connectedAddress=connectedAddress;
    }


    @OneToMany(mappedBy = "hasHobbies", fetch = FetchType.LAZY)

    private Set<HobbyInfo> hobbyInfos = new HashSet<>();

    public void addHobby(HobbyInfo hi){
        hobbyInfos.add(hi);
    }

}


