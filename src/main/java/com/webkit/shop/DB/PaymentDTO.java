package com.webkit.shop.DB;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentDTO {
	private int Pay_id;
	private String C_id;
	private LocalDateTime Pay_date;
	private int total;
}
