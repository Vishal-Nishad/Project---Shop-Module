package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopentity.shoppingmall.Shop;
@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer> {

}

