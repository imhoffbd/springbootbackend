package de.itconsultingimhoff.testprojects.springbootbackend.startup;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;


@Configuration
public class MongoDbConfig extends AbstractMongoClientConfiguration {

    @Autowired
    private Environment env;

    @Override
    protected String getDatabaseName() {
        return "test";
    }

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create(env.getProperty("mongodb.connectstring"));
    }

    @Override
    protected boolean autoIndexCreation() {
        return true;
    }
}
