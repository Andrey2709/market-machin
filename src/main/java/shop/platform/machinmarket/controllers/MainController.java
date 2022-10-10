package shop.platform.machinmarket.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import shop.platform.machinmarket.prod.Product;
import shop.platform.machinmarket.repo.Repo;
import shop.platform.machinmarket.servise.ShopServise;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {
    @Autowired
    private Repo repository;


    @GetMapping("/product/all")
    public ArrayList<Product> menu() {
              return  repository.getProducts();
    }

    @GetMapping("/product/delete{id}")
    public void del(Integer id) {
        repository.delete(id);
    }

}
