package com.shiblesadik.foodies.models.reviews;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Review extends Investigate {
    private Double rating;

    public Review() {
    }

    public Review(String id, String customerId, String raiderId, String restaurantId,
                  String orderId, String details, Double rating) {
        super(id, customerId, raiderId, restaurantId, orderId, details);
        this.rating = rating;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Review{" +
                "rating=" + rating +
                '}';
    }
}
