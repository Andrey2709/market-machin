package shop.platform.machinmarket.data;

import shop.platform.machinmarket.prod.Product;

import java.util.List;

public interface ProdDao {
    Product findById(Long id);
    List<Product> findAll();
    void saveOrUpdate(Product product);
    void deletById(Long id);

}
