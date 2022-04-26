package ru.geekbrains.lesson5.hiberDz;

import java.util.List;

public interface ProductDao {

    Product findById(Long id);

    List<Product> findAll();

    Product findByName(String title);

    void save(Product product);

    void update(Long id, String title);

}
