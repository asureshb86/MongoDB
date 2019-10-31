package com.mongo.poc.crude.operations;

import com.mongo.poc.jbdc.client.MongoJdbcClientImpl;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.WriteResult;

public class CrudeOperationsUtility {

	public static void creatDocument() {

		DB db = new MongoJdbcClientImpl().getMongoDBConnection();
		System.out.println("inside Utility method");
		if (db != null) {
			System.out.println("inside Utility method1");
			DBCollection collection = db.getCollection("book");
			WriteResult result = collection.remove(new BasicDBObject());
			System.out.println(result.toString());
			 BasicDBObject document = new BasicDBObject();
		        document.put("name", "Suresh");
		        document.put("location", "Bangalore");
		      
		        BasicDBObject documentDetail = new BasicDBObject();
		        documentDetail.put("addressLine1", "Wells Fargo");
		        documentDetail.put("addressLine2", "Marathalli");
		        documentDetail.put("addressLine3", "Bangalore, Karnataka");
		      
		        document.put("address", documentDetail);
		      
		        collection.insert(document);

		}
	}

}
