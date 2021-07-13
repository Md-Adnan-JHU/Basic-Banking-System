package bbs.controller;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AccountStatementRequest {
    private String accountNumber;

    public AccountStatementRequest() {
		super();
	}
    
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public AccountStatementRequest(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	

	

}