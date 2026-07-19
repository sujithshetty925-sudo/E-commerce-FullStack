package com.sujith.ecommerce.service;

import com.sujith.ecommerce.entity.Cart;
import com.sujith.ecommerce.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;
    public CartServiceImpl(CartRepository cartRepository){
        this.cartRepository=cartRepository;
    }
    @Override
    public Cart saveCart(Cart cart){
        return cartRepository.save(cart);
    }
    @Override
    public List<Cart>getAllCarts(){
        return cartRepository.findAll();
    }
    @Override
    public Optional<Cart>getCartById(Long id){
        return cartRepository.findById(id);
    }
    @Override
    public Cart updateCart(Long id,Cart cart) {
        Cart existingCart = cartRepository.findById(id).orElseThrow(() -> new RuntimeException("Cart not found"));
        existingCart.setUser(cart.getUser());
        existingCart.setCartItems(cart.getCartItems());
        return cartRepository.save(existingCart);
    }
    @Override
    public void deleteCart(Long id){
        cartRepository.deleteById(id);
    }
}
