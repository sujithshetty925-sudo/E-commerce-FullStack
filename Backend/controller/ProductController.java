package com.sujith.ecommerce.controller;
import com.sujith.ecommerce.entity.Product;
import java.util.List;
import java.util.Optional;
import com.sujith.ecommerce.service.ProductService;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping
    public Product saveProduct(@RequestBody Product product){
     return productService.saveProduct(product);  }

         @GetMapping
    public List<Product>getAllProducts() {
        return productService.getAllProducts();
    }
    @GetMapping("/{id}")
    public Optional<Product>getProductById(@PathVariable Long id){
        return productService.getProductById(id);}
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id,@RequestBody Product product){
      return productService.updateProduct(id,product) ;}
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id)
    {
        productService.deleteProduct(id);
        return "Product deleted Successfully";
    }
}
