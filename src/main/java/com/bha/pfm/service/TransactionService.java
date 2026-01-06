package com.bha.pfm.service;

import com.bha.pfm.model.Transaction;

public interface TransactionService {

	public void deleteById(Long id);

	public Transaction findById(Long id);

	public Transaction update(Transaction txn);
}
