package com.webkit.shop.DB;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private int Product_id;
    private String P_name;
    private int P_price;
    private int P_stock;
    private String P_expl;
    private String P_corp;

}
