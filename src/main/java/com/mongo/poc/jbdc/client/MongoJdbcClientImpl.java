package com.mongo.poc.jbdc.client;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.Mongo;

public class MongoJdbcClientImpl implements MongoJdbcClient{

	public DB getMongoDBConnection() {
		// TODO Auto-generated method stub
		
		Mongo mongo = null;
		DB db = null;
		try {
			mongo = new Mongo("localhost", 27017);
			 db = mongo.getDB("sales");
			boolean auth = db.authenticate("myTester", "myTester".toCharArray());
			System.out.println("db.authenticate(\"myTester\", \"myTester\".toCharArray())  :" +db.authenticate("myTester", "myTester".toCharArray()));
			if(auth) {
				System.out.println("inside DB not null");
				return db;
			} 
			System.out.println("inside DB null");
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return db;
	}

}
