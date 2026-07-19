package com.sujith.ecommerce.controller;

import com.sujith.ecommerce.entity.Cart;
import com.sujith.ecommerce.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/carts")
public  class CartController {
    private final CartService cartService;
    public CartController(CartService cartService){
        this.cartService=cartService;
    }
    @PostMapping
    public  Cart saveCart(@RequestBody Cart cart){
        return cartService.saveCart(cart);
}
@GetMapping
public List<Cart>getALLCarts(){
        return cartService.getAllCarts();
}
@GetMapping("/{id}")
    public Optional<Cart>getCartById(@PathVariable Long id) {
    return cartService.getCartById(id);
}
@PutMapping("/{id}")
    public Cart updateCart(@PathVariable Long id,@RequestBody Cart cart) {
    return cartService.updateCart(id, cart);
}
@DeleteMapping("/{id}")
    public String deleteCart(@PathVariable Long id){
        cartService.deleteCart(id);
        return "Cart deleted successfully";}


}


