package shop.platform.machinmarket.repo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;
import shop.platform.machinmarket.prod.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class Repo{
    private ArrayList<Product> products;

//    public Repo(ArrayList<Product> products) {
//        this.products = products;
//
//    }


    @PostConstruct
    public ArrayList<Product> init() {
        products = new ArrayList<>(Arrays.asList(new Product(1, "Wheel", 5000.0),
                new Product(2, "Brake pads", 3200.0),
                new Product(3, "Engine", 115000.0),
                new Product(4, "Rear view mirror", 300.0),
                new Product(5, "Engine oil", 700.0),
                new Product(6, "Air filter", 300.0)
        ));
        return  products;
    }
public Product getById(int id){
        return products.stream().filter(product -> product.getId()==id)
                .findFirst()
                .orElseThrow(()-> new RuntimeException());
}


    public ArrayList<Product> getProducts() {
        return products;
    }
}
