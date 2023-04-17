package com.webkit.shop.DB;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberDTO {
	private String C_id;
	private String C_pass;
	private String C_name;
	private String C_phone; 
}
