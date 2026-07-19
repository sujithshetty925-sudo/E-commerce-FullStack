package com.sujith.ecommerce.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private LocalDate orderDate;
    private Double totalAmount;
    private  String status;
    @ManyToOne
    @JoinColumn(name="user-id")
    private User user;
    public Order() {
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    public LocalDate getOrderDate(){
        return orderDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
