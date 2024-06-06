package com.hirupos.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {

    private  int product_id;
    private  String product_name;
    private  Double product_price;
    private  String product_photo;
    private  int current_stock;
    private  String curren_stock_measurement;
    private  String product_category;
}
