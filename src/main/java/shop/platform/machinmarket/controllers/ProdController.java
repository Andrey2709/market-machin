package shop.platform.machinmarket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import shop.platform.machinmarket.data_products.Product;
import shop.platform.machinmarket.data_products.ProductDto;
import shop.platform.machinmarket.servise.ShopServiseProduct;

import java.util.ArrayList;
@RequestMapping("/product")
@RestController
public class ProdController {

    private ProductDto productDto;
    private ShopServiseProduct serviseProduct;

    @GetMapping(value = "{id}")

    public ProductDto showProductById(@RequestParam(name = "id") Integer id){
       Product p = serviseProduct.findById(id);
        productDto = new ProductDto(p.getId(),p.getTitle(),p.getPrice());
        return productDto;
    }
    @GetMapping(value = "/all")
    public ArrayList<Product> showAllProducts(){
        return serviseProduct.getAllProducts();
    }

    @PostMapping()
    public void addProduct(@RequestParam(name = "id")Integer id,@RequestParam(name = "id") String title,@RequestParam(name = "id") Integer price){
        Product p = new Product(id,title,price);
        serviseProduct.saveOrUpdate(p);

    }

    @PostMapping(value = "/delete/{id}}")
    public void productDelet(@RequestParam(name = "id") Integer id){
        serviseProduct.deleteById(id);
       

    }

}
