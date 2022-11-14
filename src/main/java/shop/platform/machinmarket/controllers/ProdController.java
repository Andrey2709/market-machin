package shop.platform.machinmarket.controllers;

import org.h2.util.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shop.platform.machinmarket.data_products.Product;
import shop.platform.machinmarket.data_products.ProductDto;
import shop.platform.machinmarket.excemption.BasicExcemption;
import shop.platform.machinmarket.servise.ShopServiseProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequestMapping("/product")
@RestController
public class ProdController {

    private ProductDto productDto;
    @Autowired
    private ShopServiseProduct serviseProduct;

    @GetMapping(value = "/find/{id}")
    public ResponseEntity<?> showProductById(@PathVariable Integer id){

       Optional<Product> p = serviseProduct.findById(id);
       if(p.isPresent()){
           return new ResponseEntity<>(p.get(), HttpStatus.OK);
       }
       return new ResponseEntity<>(new BasicExcemption(HttpStatus.NOT_FOUND.value(),"This object not fount in data base"), HttpStatus.NOT_FOUND);
//       return serviseProduct.findById(id);
    }
    @GetMapping(value = "/all")
    public List<Product> showAllProducts(){
        return serviseProduct.getAllProducts();
    }

    @PostMapping()
    public void addProduct(@RequestParam Integer id,@RequestParam String title,@RequestParam Integer price){
        Product p = new Product(id,title,price);
        serviseProduct.saveOrUpdate(p);

    }

    @PostMapping(value = "/delete/{id}}")
    public void productDelet(@RequestParam Integer id){
        serviseProduct.deleteById(id);
       

    }

}
