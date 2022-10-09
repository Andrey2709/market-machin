package shop.platform.machinmarket.servise;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.platform.machinmarket.prod.Product;
import shop.platform.machinmarket.repo.Repo;

import java.util.ArrayList;

@Service
public class ShopServise {
@Autowired
    private   Repo repository;


   public void changeCostProduct(Integer id , Double cost){
       Product p = repository.getById(id);
       p.setCost(cost);
   }

}
