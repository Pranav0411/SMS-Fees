package com.usecase.Fees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.Fees.payload.DataTransfer;
import com.usecase.Fees.service.Services;


@RestController
@RequestMapping("/api/fees")
@CrossOrigin(origins = "http://localhost:3000")
public class FeesController {
	
	@Autowired
	private Services services;
	
	@PostMapping("/create")
	public ResponseEntity<DataTransfer> createFees(@RequestBody DataTransfer stdo)
	{
		DataTransfer dataTransfer =  this.services.createFees(stdo);
		return new ResponseEntity<>(dataTransfer,HttpStatus.CREATED);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<DataTransfer>> getAllFees()
	{
		return ResponseEntity.ok(this.services.getAllFees());
	}
	
	

}
