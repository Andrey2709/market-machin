package shop.platform.machinmarket.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.platform.machinmarket.data_products.Product;
import shop.platform.machinmarket.data_products.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ShopServiseProduct {
@Autowired
    private ProductRepository productRepository;

public List<Product> getAllProducts(){
    return  productRepository.findAll();
   }
   public Optional<Product> findById(Integer id){
    return productRepository.findById(id);
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
