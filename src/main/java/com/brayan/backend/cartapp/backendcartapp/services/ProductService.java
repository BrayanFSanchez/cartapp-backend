package com.brayan.backend.cartapp.backendcartapp.services;

import java.util.List;

import com.brayan.backend.cartapp.backendcartapp.models.entities.Product;

public interface ProductService {
    List<Product> findAll();
}
