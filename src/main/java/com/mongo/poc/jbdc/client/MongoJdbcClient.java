package com.mongo.poc.jbdc.client;

import com.mongodb.DB;

public interface MongoJdbcClient {

	public DB getMongoDBConnection();
}
