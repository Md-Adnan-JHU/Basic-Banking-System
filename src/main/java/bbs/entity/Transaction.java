package bbs.entity;

import java.math.BigDecimal;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

	@Data
	@Entity
	@Table(name = "transactions")
	public class Transaction {


		@Id
		@GeneratedValue
	    public Long transactionId;
	    private String senderAccountNumber;
	    private String recieverAccountNumber;
		private BigDecimal transactionAmount;

		public Transaction() {
			super();
		}

		public Transaction(Long transactionId, String senderAccountNumber, String recieverAccountNumber,
				BigDecimal transactionAmount) {
			super();
			this.transactionId = transactionId;
			this.setSenderAccountNumber(senderAccountNumber);
			this.setRecieverAccountNumber(recieverAccountNumber);
			this.setTransactionAmount(transactionAmount);
		}

		public String getSenderAccountNumber() {
			return senderAccountNumber;
		}

		public void setSenderAccountNumber(String senderAccountNumber) {
			this.senderAccountNumber = senderAccountNumber;
		}

		public String getRecieverAccountNumber() {
			return recieverAccountNumber;
		}

		public void setRecieverAccountNumber(String recieverAccountNumber) {
			this.recieverAccountNumber = recieverAccountNumber;
		}

		public BigDecimal getTransactionAmount() {
			return transactionAmount;
		}

		public void setTransactionAmount(BigDecimal transactionAmount) {
			this.transactionAmount = transactionAmount;
		}

		
		
		
		

		

		

		

	   
	}

