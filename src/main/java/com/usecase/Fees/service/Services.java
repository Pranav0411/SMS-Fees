package com.usecase.Fees.service;

import java.util.List;

import com.usecase.Fees.payload.DataTransfer;

public interface Services {
	
	DataTransfer createFees(DataTransfer dt);
	
	List<DataTransfer> getAllFees();

}
