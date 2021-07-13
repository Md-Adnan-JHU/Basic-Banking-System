package bbs.dto;


import java.math.BigDecimal;
import java.util.List;

import bbs.entity.Transaction;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Data
@Getter
@Setter
public class AccountStatement {
    
	BigDecimal currentBalance;
    List<Transaction> transactionHistory;
    
	public AccountStatement(BigDecimal currentBalance, List<Transaction> transactionHistory) {
		super();
		this.currentBalance = currentBalance;
		this.transactionHistory = transactionHistory;
	}
    
	
	
    
    
}