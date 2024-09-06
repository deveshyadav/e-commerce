/*
package pl.piomin.microservices.advanced.account.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfig {

    @Bean
    public MongoClient mongoClient() {
        // Create MongoCredential with username and password
        MongoCredential credential = MongoCredential.createCredential("micro", "mydatabase", "micro".toCharArray());

        // Build MongoClientSettings with custom settings
        MongoClientSettings settings = MongoClientSettings.builder()
                .credential(credential)
                .applyConnectionString(new ConnectionString("mongodb://localhost:27017"))
                .build();

        // Return MongoClient instance
        return MongoClients.create(settings);
    }
}

*/
