package com.sujith.ecommerce.service;

import com.sujith.ecommerce.entity.Cart;

import java.util.List;
import java.util.Optional;
public interface CartService {
    Cart saveCart(Cart cart);
    List<Cart> getAllCarts();
    Optional<Cart>getCartById(Long id);
    Cart updateCart(Long id,Cart cart);
    void deleteCart(Long id);
}
