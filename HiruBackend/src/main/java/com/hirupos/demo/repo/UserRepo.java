package com.hirupos.demo.repo;

import com.hirupos.demo.entity.hiru_inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepo extends JpaRepository<hiru_inventory,Integer> {
    @Query(value =  "SELECT * FROM hiru_inventory WHERE product_category =?1",nativeQuery = true)
    List<hiru_inventory> getDataByCategory(String  category);
}
