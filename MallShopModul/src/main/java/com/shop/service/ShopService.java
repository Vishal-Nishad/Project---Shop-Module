package com.shop.service;

import com.shopentity.shoppingmall.Shop;
import com.shop.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public List<Shop> listAll() {
        return shopRepository.findAll();
    }

    public Shop save(Shop shop) {
        return shopRepository.save(shop);
    }

    public void delete(Integer id) {
        shopRepository.deleteById(id);
    }

    public Shop getShopById(Integer id) {
        Optional<Shop> optionalShop = shopRepository.findById(id);
        return optionalShop.orElse(null);
    }

    public Shop update(Integer id, Shop updatedShop) {
        Optional<Shop> optionalExistingShop = shopRepository.findById(id);
        if (optionalExistingShop.isPresent()) {
            Shop existingShop = optionalExistingShop.get();
            // Update existing shop with new data
            existingShop.setShopCategory(updatedShop.getShopCategory());
            existingShop.setShopName(updatedShop.getShopName());
            existingShop.setCustomers(updatedShop.getCustomers());
            existingShop.setShopStatus(updatedShop.getShopStatus());
            existingShop.setLeaseStatus(updatedShop.getLeaseStatus());
            return shopRepository.save(existingShop);
        } else {
            return null; // Shop not found, return null
        }
    }
}
