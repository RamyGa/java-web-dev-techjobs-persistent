package org.launchcode.javawebdevtechjobspersistent.models;

import org.hibernate.mapping.Join;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {


    @NotBlank(message = "location required")
    @Size(min = 4, max = 30, message = "location must be between 4 and 30 characters")
    private String location;

    @OneToMany()
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

    public Employer(@NotBlank(message = "location required") @Size(min = 4, max = 30, message = "location must be " +
            "between 4 and 30 characters") String location) {
        this.location = location;
    }

    public Employer() {
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
