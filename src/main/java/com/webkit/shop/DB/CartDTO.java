package com.webkit.shop.DB;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartDTO {
	private int Cart_id;
	private String C_id;
	private int Product_id;
	private String P_name;
	private int P_price;
	private int amount;
	private int Cart_money;
	private boolean flag;
}
