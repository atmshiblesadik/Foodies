package com.shiblesadik.foodies.models.restaurants;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "restaurants")
public class Restaurant {
    @Id
    private String id;
    private String name;
    private String email;
    private String[] phones;
    private String avatar;
    private String areaId;
    private Double rating;
    private String numberOfFoods;
    private String numberOfCategories;
    private String numberOfOrders;
    private String[] foodsIds;
    private String[] categoriesIds;
    private String[] ordersIds;
    private String[] reviewsIds;
    private String[] complaintsIds;

    public Restaurant() {
    }

    public Restaurant(String id, String name, String email, String[] phones, String avatar, String areaId,
                      Double rating, String numberOfFoods, String numberOfCategories,
                      String numberOfOrders, String[] foodsIds, String[] categoriesIds, String[] ordersIds,
                      String[] reviewsIds, String[] complaintsIds) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phones = phones;
        this.avatar = avatar;
        this.areaId = areaId;
        this.rating = rating;
        this.numberOfFoods = numberOfFoods;
        this.numberOfCategories = numberOfCategories;
        this.numberOfOrders = numberOfOrders;
        this.foodsIds = foodsIds;
        this.categoriesIds = categoriesIds;
        this.ordersIds = ordersIds;
        this.reviewsIds = reviewsIds;
        this.complaintsIds = complaintsIds;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getNumberOfFoods() {
        return numberOfFoods;
    }

    public void setNumberOfFoods(String numberOfFoods) {
        this.numberOfFoods = numberOfFoods;
    }

    public String getNumberOfCategories() {
        return numberOfCategories;
    }

    public void setNumberOfCategories(String numberOfCategories) {
        this.numberOfCategories = numberOfCategories;
    }

    public String getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setNumberOfOrders(String numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }

    public String[] getFoodsIds() {
        return foodsIds;
    }

    public void setFoodsIds(String[] foodsIds) {
        this.foodsIds = foodsIds;
    }

    public String[] getCategoriesIds() {
        return categoriesIds;
    }

    public void setCategoriesIds(String[] categoriesIds) {
        this.categoriesIds = categoriesIds;
    }

    public String[] getOrdersIds() {
        return ordersIds;
    }

    public void setOrdersIds(String[] ordersIds) {
        this.ordersIds = ordersIds;
    }

    public String[] getReviewsIds() {
        return reviewsIds;
    }

    public void setReviewsIds(String[] reviewsIds) {
        this.reviewsIds = reviewsIds;
    }

    public String[] getComplaintsIds() {
        return complaintsIds;
    }

    public void setComplaintsIds(String[] complaintsIds) {
        this.complaintsIds = complaintsIds;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phones=" + Arrays.toString(phones) +
                ", avatar='" + avatar + '\'' +
                ", areaId='" + areaId + '\'' +
                ", rating=" + rating +
                ", numberOfFoods=" + numberOfFoods +
                ", numberOfCategories=" + numberOfCategories +
                ", numberOfOrders=" + numberOfOrders +
                ", foodsIds=" + Arrays.toString(foodsIds) +
                ", categoriesIds=" + Arrays.toString(categoriesIds) +
                ", ordersIds=" + Arrays.toString(ordersIds) +
                ", reviewsIds=" + Arrays.toString(reviewsIds) +
                ", complaintsIds=" + Arrays.toString(complaintsIds) +
                '}';
    }
}
