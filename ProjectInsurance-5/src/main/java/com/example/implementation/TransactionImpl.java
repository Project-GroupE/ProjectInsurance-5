package com.example.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Transaction;
import com.example.repository.TransactionRepository;
import com.example.service.TransactionService;

@Service
public class TransactionImpl implements TransactionService{
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Override
	public Transaction saveTransaction(Transaction transaction) {
		Transaction transaction2=transactionRepository.save(transaction);
		return transaction2;
	}

	@Override
	public Transaction getTransaction(Integer id) {
		Transaction transaction=transactionRepository.findById(id);
		return transaction;
	}

	@Override
	public Transaction updateTransaction(Transaction transaction) {
		Transaction transaction2=transactionRepository.save(transaction);
		return transaction2;
	}

	@Override
	public void deleteTransaction(Integer id) {
		transactionRepository.deleteById(id);		
	}

}
