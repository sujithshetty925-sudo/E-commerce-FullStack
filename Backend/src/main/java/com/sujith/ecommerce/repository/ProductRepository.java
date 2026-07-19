package com.sujith.ecommerce.repository;
import com.sujith.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product ,Long>{
}
