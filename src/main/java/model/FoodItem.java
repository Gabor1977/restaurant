package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class FoodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long foodID;

    @NotNull
    private String name;

    @NotNull
    private int quantity;

    @NotNull
    private double unitPrice;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;


    public long getFoodID() {
        return foodID;
    }

    public void setFoodID(long foodID) {
        this.foodID = foodID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
