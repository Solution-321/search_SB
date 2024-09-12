package com.searchfeature.service;

import java.util.List;

import com.searchfeature.entity.Product;

public interface ProductService {

	List<Product> searchProducts(String query);

	Product createProduct(Product product);
}
