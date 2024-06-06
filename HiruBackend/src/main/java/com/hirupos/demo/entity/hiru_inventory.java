package com.hirupos.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class hiru_inventory {
    @Id
    private  int product_id;
    private  String product_name;
    private  Double product_price;
    private  String product_photo;
    private  int current_stock;
    private  String curren_stock_measurement;
    private  String product_category;
}
