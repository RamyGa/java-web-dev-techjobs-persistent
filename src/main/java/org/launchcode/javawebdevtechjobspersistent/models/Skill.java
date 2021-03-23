package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {


    @Size(min = 5, message = "please add more characters in this description")
    private String description;


    public Skill() {
    }
}