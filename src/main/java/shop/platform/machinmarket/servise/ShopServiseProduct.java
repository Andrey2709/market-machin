package shop.platform.machinmarket.servise;

import org.springframework.stereotype.Service;
import shop.platform.machinmarket.data_products.Product;
import shop.platform.machinmarket.data_products.ProductRepository;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ShopServiseProduct {

    private ProductRepository productRepository;

public ArrayList<Product> getAllProducts(){
    return (ArrayList<Product>) productRepository.findAll();
   }
   public Product findById(Integer id){
    return productRepository.findById(id).orElseThrow();
   }

   public void deleteById(Integer id){
    productRepository.deleteById(id);
   }

   public void saveOrUpdate(Product p) {
       Product product = productRepository.getById(p.getId());
       if (product == null) {
        productRepository.saveAndFlush(p);
       } else {
           product = new Product(p.getId(), p.getTitle(), p.getPrice());
           productRepository.saveAndFlush(product);
       }
   }

}
