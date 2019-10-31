package com.mongo.poc.crude.operations;

public class CrudeOperationsMain {
	
	public static void main(String args[]) {
		
		CrudeOperationsImpl crudeOper = new CrudeOperationsImpl();
		System.out.println("inside main method");
		crudeOper.createCollection();
	}
}
