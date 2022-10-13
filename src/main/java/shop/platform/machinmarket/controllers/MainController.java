package shop.platform.machinmarket.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import shop.platform.machinmarket.data.ProductDao;
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

    private ProductDao dao;


    @GetMapping("/product/all")
    public List<Product> menu() {
              return  dao.findAll();
    }

    @GetMapping("/product/delete{id}")
    public void del(Integer id) {
        repository.delete(id);
    }


}
