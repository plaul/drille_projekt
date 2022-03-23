package com.example.hobbiezz.entity;

import com.example.hobbiezz.dto.HobbyRequest;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor

public class Hobby {
    @Id
    String name;
    String category;

    String link;
    String inOut;

    /*@OneToMany(mappedBy = "hobbyWithInfo")
    private Set<HobbyInfo> hobbies = new HashSet<>();*/

    public Hobby(HobbyRequest body){
        this.name = body.getName();
        this.category= body.getCategory();
        this.link = body.getLink();
        this.inOut = body.getInOut();
    }

    public Hobby(String name, String category, String link, String inOut) {
        this.name = name;
        this.category= category;
        this.link = link;
        this.inOut = inOut;
    }

    @OneToMany(mappedBy = "hobbyObject", fetch = FetchType.EAGER)
    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)

    private Set<HobbyInfo> hobbyInfos = new HashSet<>();

    public void addHobbyObject(HobbyInfo hi){
        hobbyInfos.add(hi);
    }

}
