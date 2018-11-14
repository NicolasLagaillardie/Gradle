package com.esme.spring.faircorp.model;

import javax.persistence.*;
import java.util.List;

@Entity
//@Table(name = "SP_Room")
public class Building {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany (mappedBy = "building")
    private List<Building> buildings;

    public Building() {
    }

    public Building(String name, Integer floor) {
        this.name = name;
        this.floor = floor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public List<Light> getLights() {return lights;}

    public Building getBuilding() {return building;}
}