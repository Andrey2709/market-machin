package shop.platform.machinmarket.data_products;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.platform.machinmarket.data_clients.Client;

import java.util.List;
import java.util.Optional;

public interface ProductRepository  extends JpaRepository<Product , Integer> {

//    Optional<Product> findById(Integer id);
//    List<Product> findAll();
//    void deleteById (Integer id);


}
