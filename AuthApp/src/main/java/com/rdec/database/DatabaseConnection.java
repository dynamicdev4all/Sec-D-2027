package com.rdec.database;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import shadow.org.bson.Document;

public class DatabaseConnection {
	
	  static String connectionString = "mongodb+srv://piebytwo014:piebytwo014@cluster0.ide7vos.mongodb.net/?appName=Cluster0";
	  static ServerApi serverApi = ServerApi.builder()
	                .version(ServerApiVersion.V1)
	                .build();
	  static MongoClientSettings settings = MongoClientSettings.builder()
		                .applyConnectionString(new ConnectionString(connectionString))
		                .serverApi(serverApi)
		                .build();
	  static MongoClient mongoClient = MongoClients.create(settings);
	  static MongoDatabase database = mongoClient.getDatabase("secd");
	  static MongoCollection<Document> c = database.getCollection("users");
	
			  
			  
	public static boolean insertUserData(String firstName, String lastName, int phone, String userEmail, String userPassword) {
		try {
			  c.insertOne(new Document("firstName", firstName)
		  				.append("lastName", lastName)
		  				.append("mobileNum", phone)
		  				.append("userEmail", userEmail)
		  				.append("userPassword", userPassword)
		  				.append("isVerified", false));
			  return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public static void verifyUser(String email, int phone) {
		Document user = c.find(new Document("userEmail", email)).first();
		if(user != null) {
			boolean status = Boolean.parseBoolean(user.getString("isVerified"));
			System.out.println();
		}
	
	}
	
}
