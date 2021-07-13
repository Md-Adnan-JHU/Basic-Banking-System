package bbs.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import bbs.entity.Account;
import bbs.service.MyService;



@Controller
public class MyController {

	
	@Autowired
	MyService Mserv;
	
	 @RequestMapping("/home")
     public String OpenHome(Model model) {
         return "home";
     }
	 
	 @RequestMapping("/aboutus")
     public String OpenAboutUs(Model model) {
         return "aboutus";
     }
	
	
	 @RequestMapping("/transferForm")
	  public String showNewForm(Model model) {
	  	 TransferBalanceRequest a = new TransferBalanceRequest();
	  	 model.addAttribute("transferBalanceRequest",a);
	  	 return "transfer";
	 }
		
	  @RequestMapping("/transfer")
	  public String sendMoney(@ModelAttribute TransferBalanceRequest transferBalanceRequest) {
		  Mserv.sendMoney(transferBalanceRequest);
		  return "redirect:/transactions";
	  }
	  
	  @RequestMapping("/transactions")
	  public String viewAllTransactions(Model model) {
	  	  model.addAttribute("listTransactions", Mserv.getAll());
          return "viewallTransactions";
	  }
	  
	  @GetMapping("/all")
	  public String allCustomers(Model model) {
		 model.addAttribute("listAccounts", Mserv.getAllAccount());
	  	 return "viewAllCustomers";
	  }
	  
	  
	  @RequestMapping("/accountForm")
	  public String showaccountForm(Model model) {
	  	 Account account = new Account();
	  	 model.addAttribute("account", account);
	  	 return "addCustomer";
	  }
 
	  @PostMapping("/create")
	  public String saveCustomer(@ModelAttribute("account") Account account) {
	  	 Mserv.saveAccount(account);
	  	 return "redirect:/all";
	  }
	  

}
