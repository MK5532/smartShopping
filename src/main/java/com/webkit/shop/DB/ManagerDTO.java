package com.webkit.shop.DB;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ManagerDTO {
	private String M_id;
	private String M_pass;
	private String M_name;
	private String M_phone; 
	private String M_corp; 
}
