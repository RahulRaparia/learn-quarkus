package org.acuver;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class FruitService {
    @Inject MongoClient mongoClient;

    public List<Fruit> list(){
        List<Fruit> list = new ArrayList<>();
        MongoCursor<Document> cursor = getCollection().find().iterator();
        try {
            while (cursor.hasNext()) {
                Document document = cursor.next();
                Fruit fruit = new Fruit();
                // fruit.setId(document.getObjectId("_id").toString());
                fruit.setName(document.getString("name"));
                fruit.setDescription(document.getString("description"));
                list.add(fruit);
            }
        } finally {
            cursor.close();
        }
        return list;
    }

    public void add(Fruit fruit){
        Document document = new Document();
        document.append("name", fruit.getName());
        document.append("description", fruit.getDescription());
        getCollection().insertOne(document);
    }

    private MongoCollection getCollection() {
        return mongoClient.getDatabase("fruit").getCollection("fruit");
    }
    
}
