package com.sujith.ecommerce.repository;

import com.sujith.ecommerce.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository <Cart,Long>{
}
