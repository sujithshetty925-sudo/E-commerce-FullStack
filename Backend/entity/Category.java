package com.sujith.ecommerce.entity;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name="categories")
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO) private Long id;
    private String name;
    @OneToMany(mappedBy="category")
    @JsonIgnore
    private List<Product>products;
    public Category() {
    }
    public Category(Long id,String name){
        this.id=id;
        this.name=name;
    }
    public Long getId(){
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public List<Product>getProducts() {
        return products;
    }
    public void setProducts(List<Product>products){
        this.products=products;

    }
}
