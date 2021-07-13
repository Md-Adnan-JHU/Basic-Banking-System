package bbs.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Builder
	@AllArgsConstructor
	@NoArgsConstructor
	@Data
	@Entity
	@Table(name = "accounts")
	public class Account {

	    @Id
	    @GeneratedValue
	    private Long accountId;
	    private String accountNumber;
	    private String holderName;
	    private BigDecimal currentBalance;
	    
	    

		public Long getAccountId() {
			return accountId;
		}

		public void setAccountId(Long accountId) {
			this.accountId = accountId;
		}

		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}

		public BigDecimal getCurrentBalance() {
			return currentBalance;
		}

		public void setCurrentBalance(BigDecimal currentBalance) {
			this.currentBalance = currentBalance;
		}

		public String getHolderName() {
			return holderName;
		}

		public void setHolderName(String holderName) {
			this.holderName = holderName;
		}

		
	    
	    

	}

