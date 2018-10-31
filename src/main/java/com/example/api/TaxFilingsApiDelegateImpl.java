package com.example.api;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.api.models.TaxFilingObject;



public class TaxFilingsApiDelegateImpl implements TaxFilingsApiDelegate {

	@Override
	public ResponseEntity<TaxFilingObject> getTaxFiling(String id) {
		TaxFilingObject taxFilingObject = new TaxFilingObject();
	    return new ResponseEntity<TaxFilingObject>(taxFilingObject, HttpStatus.OK);
		
	}

	
}
