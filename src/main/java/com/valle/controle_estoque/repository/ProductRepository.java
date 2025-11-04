package com.valle.controle_estoque.repository;

import com.valle.controle_estoque.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends BaseRepository<Product, Long> {

}
