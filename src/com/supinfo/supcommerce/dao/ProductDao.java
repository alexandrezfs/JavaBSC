package com.supinfo.supcommerce.dao;

import com.supinfo.supcommerce.entity.Product;

import java.util.List;

/**
 * @author Alexandre Nguyen <alex.nr@hotmail.co.jp>
 */
public interface ProductDao {

    void save(Product product);

    List<Product> getUnderPrice(Float max);

    List<Product> getAll();

    void delete(Product product);

    Product getById(Long id);
}
