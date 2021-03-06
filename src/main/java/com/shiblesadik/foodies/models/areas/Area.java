package com.shiblesadik.foodies.models.areas;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "areas")
public class Area {
    @Id
    private String id; // id = area code
    private String name;
    private String cityId;
    private Integer numberOfRestaurants;
    private Integer numberOfRaider;
    private Integer numberOfCustomer;
    private Integer numberOfAdmin;

    public Area() {
    }

    public Area(String id, String name, String cityId) {
        this.id = id;
        this.name = name;
        this.cityId = cityId;
    }

    public Area(String id, String name, String cityId, Integer numberOfRestaurants, Integer numberOfRaider,
                Integer numberOfCustomer, Integer numberOfAdmin) {
        this.id = id;
        this.name = name;
        this.cityId = cityId;
        this.numberOfRestaurants = numberOfRestaurants;
        this.numberOfRaider = numberOfRaider;
        this.numberOfCustomer = numberOfCustomer;
        this.numberOfAdmin = numberOfAdmin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public Integer getNumberOfRestaurants() {
        return numberOfRestaurants;
    }

    public void setNumberOfRestaurants(Integer numberOfRestaurants) {
        this.numberOfRestaurants = numberOfRestaurants;
    }

    public Integer getNumberOfRaider() {
        return numberOfRaider;
    }

    public void setNumberOfRaider(Integer numberOfRaider) {
        this.numberOfRaider = numberOfRaider;
    }

    public Integer getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public void setNumberOfCustomer(Integer numberOfCustomer) {
        this.numberOfCustomer = numberOfCustomer;
    }

    public Integer getNumberOfAdmin() {
        return numberOfAdmin;
    }

    public void setNumberOfAdmin(Integer numberOfAdmin) {
        this.numberOfAdmin = numberOfAdmin;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cityId='" + cityId + '\'' +
                ", numberOfRestaurants=" + numberOfRestaurants +
                ", numberOfRaider=" + numberOfRaider +
                ", numberOfCustomer=" + numberOfCustomer +
                ", numberOfAdmin=" + numberOfAdmin +
                '}';
    }
}
