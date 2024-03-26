package com.shop.controller;

import com.shopentity.shoppingmall.Shop;
import com.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shops")
public class ShopController {

    @Autowired
    private ShopService shopService;

    // Retrieve all shops
    @GetMapping
    public ResponseEntity<List<Shop>> getAllShops() {
        List<Shop> shops = shopService.listAll();
        return new ResponseEntity<>(shops, HttpStatus.OK);
    }

    // Retrieve a specific shop by ID
    @GetMapping("/{id}")
    public ResponseEntity<Shop> getShopById(@PathVariable("id") Integer id) {
        Shop shop = shopService.getShopById(id);
        if (shop != null) {
            return new ResponseEntity<>(shop, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Add a new shop
    @PostMapping
    public ResponseEntity<Shop> addShop(@RequestBody Shop shop) {
        Shop savedShop = shopService.save(shop);
        return new ResponseEntity<>(savedShop, HttpStatus.CREATED);
    }

    // Update an existing shop
    @PutMapping("/{id}")
    public ResponseEntity<Shop> updateShop(@PathVariable("id") Integer id, @RequestBody Shop shop) {
        Shop updatedShop = shopService.update(id, shop);
        if (updatedShop != null) {
            return new ResponseEntity<>(updatedShop, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete a shop by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteShop(@PathVariable("id") Integer id) {
        shopService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
