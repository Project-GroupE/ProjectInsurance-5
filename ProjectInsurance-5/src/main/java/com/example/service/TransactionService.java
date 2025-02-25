package com.example.service;

import com.example.entity.Transaction;

public interface TransactionService {

	public Transaction saveTransaction(Transaction transaction);
	
	public Transaction getTransaction(Integer id);
	
	public Transaction updateTransaction(Transaction transaction);
	
	public void deleteTransaction(Integer id);
}
