package shop.platform.machinmarket.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.platform.machinmarket.prod.Product;
import shop.platform.machinmarket.repo.Repo;

@Service
public class ShopServise {
@Autowired
    private   Repo repository;


   public void changeCostProduct(Integer id , int cost){
       Product p = repository.getById(id);
       p.setPrice(cost);
   }

}
