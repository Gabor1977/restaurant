package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Order {
    @Id
    @NotNull
    private Long orderID;

    @NotNull
    private Long userID;

    @NotNull
    private Integer quantity;

    @NotNull
    private Double price;

    @OneToMany(targetEntity = OrderItem.class, mappedBy = "OrderItem_orderID")
    private OrderItem orderItem;

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
