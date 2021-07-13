package bbs.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bbs.controller.TransferBalanceRequest;
import bbs.entity.Account;
import bbs.entity.Transaction;
import bbs.repository.AccountRepository;
import bbs.repository.TransactionRepository;

@Service
public class MyService {

	
	@Autowired
	AccountRepository Arepo;
	@Autowired
	TransactionRepository Trepo;
	
	public List<Transaction> getAll(){
		 return Trepo.findAll();
    }
	
	public List<Account> getAllAccount() {
		return Arepo.findAll();
	}

	public void saveAccount(Account account) {
	    this.Arepo.save(account);
    }
	
    public Transaction sendMoney(TransferBalanceRequest transferBalanceRequest) {
		  String fromAccountNumber = transferBalanceRequest.getFromAccountNumber();
		  String toAccountNumber = transferBalanceRequest.getToAccountNumber();
		  BigDecimal amount = transferBalanceRequest.getAmount();
		  Account fromAccount = Arepo.findByAccountNumberEquals(fromAccountNumber);
		  Account toAccount = Arepo.findByAccountNumberEquals(toAccountNumber);
		  if(fromAccount.getCurrentBalance().compareTo(BigDecimal.ONE) == 1 && fromAccount.getCurrentBalance().compareTo(amount) == 1){
		      fromAccount.setCurrentBalance(fromAccount.getCurrentBalance().subtract(amount));
		      Arepo.save(fromAccount);
		      toAccount.setCurrentBalance(toAccount.getCurrentBalance().add(amount));
		      Arepo.save(toAccount);
		      Transaction transaction = Trepo.save((new Transaction(0L, fromAccountNumber,toAccountNumber, amount)));
		      return transaction;
		      }
		  return null;
		    
		}
}
