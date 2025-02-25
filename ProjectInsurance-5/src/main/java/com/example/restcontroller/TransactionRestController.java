package com.example.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Transaction;
import com.example.service.TransactionService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class TransactionRestController {

	@Autowired
	private TransactionService transactionService;
	
	@PostMapping("/saveTransaction")
	public Transaction saveTransaction(@RequestBody Transaction transaction) {
		Transaction transaction3=transactionService.saveTransaction(transaction);
		return transaction3;
	}
	
	@GetMapping("/getTransaction/{id}")
	public Transaction getTransaction(@PathVariable Integer id){
		Transaction transaction=transactionService.getTransaction(id);
		return transaction;
	}
	
	@PutMapping("/updateTransaction")
	public Transaction updateTransaction(@RequestBody Transaction transaction) {
		Transaction transaction2=transactionService.updateTransaction(transaction);
		return transaction2;
	}
	
	@DeleteMapping("/deleteTransaction/{id}")
	public String deleteTransaction(@PathVariable Integer id) {
		transactionService.deleteTransaction(id);
		return "Transaction id >> "+id+" is deleted";
	}
}
