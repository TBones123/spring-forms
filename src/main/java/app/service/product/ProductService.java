package app.service.product;

import app.entity.Product;

import java.util.List;

public interface ProductService {

    void save(Product assortment);

    List<Product> findAll();

    Product findOne(int id);



}
