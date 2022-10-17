package shop.platform.machinmarket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shop.platform.machinmarket.data_products.ProductDao;
import shop.platform.machinmarket.data_products.Product;
import shop.platform.machinmarket.repo.Repo;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    private Repo repository;

    private ProductDao dao;

    @GetMapping("/hello")
    @ResponseBody
    public  String hello(){
        return  "Hello world";
    }

    @GetMapping("/product/all")
    public List<Product> menu() {
              return  repository.getProducts();
    }

    @GetMapping("/product/delete{id}")
    public void del(Integer id) {
        repository.delete(id);
    }

}
