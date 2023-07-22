package io.github.follyfields.models;

import java.util.Date;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Product extends PanacheEntity {
    public String code;
    public String description;
    public Double price;
    public Date lastPurchase;
    public int stock;
    public boolean active;
}
