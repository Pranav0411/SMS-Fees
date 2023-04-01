package com.usecase.Fees.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecase.Fees.model.Fees;
import com.usecase.Fees.payload.DataTransfer;
import com.usecase.Fees.repository.FeesRepo;


@Service
public class ServiceImpl implements Services {

	@Autowired
	private FeesRepo feesRepo;
	
	
	public ServiceImpl(FeesRepo feesRepo) {
		super();
		this.feesRepo = feesRepo;
	}

	@Override
	public DataTransfer createFees(DataTransfer dt) {
		
		Fees fees = this.ftodt(dt);
		Fees savedfees = this.feesRepo.save(fees);
		return this.dttof(savedfees);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DataTransfer> getAllFees() {
		List<Fees> f = this.feesRepo.findAll();
		List<DataTransfer> fee =  f.stream().map(fees->this.dttof(fees)).collect(Collectors.toList());
		// TODO Auto-generated method stub
		return fee;
	}
	
	private Fees ftodt(DataTransfer dt)
	{
		Fees f = new Fees();
		f.setId(dt.getId());
		f.setName(dt.getName());
		f.setAmount(dt.getAmount());
		f.setPaymentid(dt.getPaymentid());
		f.setFeestype(dt.getFeestype());
		
		return f;
	}
	
	private DataTransfer dttof(Fees f)
	{
		DataTransfer dt = new DataTransfer();
		dt.setId(f.getId());
		dt.setName(f.getName());
		dt.setAmount(f.getAmount());
		dt.setPaymentid(f.getPaymentid());
		dt.setFeestype(f.getFeestype());
		
		return dt;
		
	}

}
