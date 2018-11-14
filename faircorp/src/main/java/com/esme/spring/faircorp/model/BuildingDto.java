package com.esme.spring.faircorp.model;

import javax.persistence.Column;
import java.util.List;

public class BuildingDto {

    private Long id;
    private List<Room> Rooms;

    public BuildingDto(Object room) {
    }

    public BuildingDto(List<Room> Rooms) {
        this.id = room.getId();
        this.Rooms = room.getBuildings();
    }

    public Long getId() {
        return id;
    }

    public Integer getFloor() {
        return floor;
    }

    public String getName() {
        return name;
    }

}
