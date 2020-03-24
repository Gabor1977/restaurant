package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private Double price;

    @OneToMany(targetEntity = FoodItem.class, mappedBy = "FoodItem_foodID")
    private Set<FoodItem> foodItem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Set<FoodItem> getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(Set<FoodItem> foodItem) {
        this.foodItem = foodItem;
    }
}
