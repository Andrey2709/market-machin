package shop.platform.machinmarket.servise;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.platform.machinmarket.prod.Product;
import shop.platform.machinmarket.repo.Repo;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ShopServise {

    public final Repo repository;

    public Product getProduct(int id){
        return repository.getById(id);
    }

    public ArrayList<Product> all(){
        return repository.getProducts();
    }



}
