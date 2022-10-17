package shop.platform.machinmarket.repo;

import org.springframework.stereotype.Component;
import shop.platform.machinmarket.data_products.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class Repo {
    private List<Product> products;

//    public Repo(ArrayList<Product> products) {
//        this.products = products;
//
//    }


    @PostConstruct
    public void init() {
        products = new ArrayList<>(Arrays.asList(
                new Product(1, "Wheel", 5000),
                new Product(2, "Brake pads", 3200),
                new Product(3, "Engine", 115000),
                new Product(4, "Rear view mirror", 300),
                new Product(5, "Engine oil", 700),
                new Product(6, "Air filter", 300)
        ));

    }

    public Product getById(int id) {
        return products.stream().filter(product -> product.getId()==id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException());
    }


    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }


    public void delete(int id) {
        products.removeIf(p -> p.getId() == id);
    }


}
