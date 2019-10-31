package com.mongo.poc.crude.operations;

public class CrudeOperationsImpl implements CrudeOperations {

	public void createCollection() {
		System.out.println("inside interface impl method");
		CrudeOperationsUtility.creatDocument();
		
	}
	

}
