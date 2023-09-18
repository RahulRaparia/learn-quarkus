// package com.entity;

// import java.time.LocalDate;
// import java.util.List;

// import org.bson.codecs.pojo.annotations.BsonProperty;

// import io.quarkus.mongodb.panache.PanacheMongoEntity;
// import io.quarkus.mongodb.panache.common.MongoEntity;

// @MongoEntity(collection="ThePerson")
// public class Person_Re extends PanacheMongoEntity {
//     public String name;

//     // will be persisted as a 'birth' field in MongoDB
//     @BsonProperty("birth")
//     public LocalDate birthDate;

//     public Status status;

//     // return name as uppercase in the model
//     public String getName(){
//         return name.toUpperCase();
//     }

//     // store all names in lowercase in the DB
//     public void setName(String name){
//         this.name = name.toLowerCase();
//     }

//     public static Person_Re findByName(String name){
//         return find("name", name).firstResult();
//     }

//     public static List<Person_Re> findAlive(){
//         return list("status", Status.isClairvoyant);
//     }

//     public static void deleteLoics(){
//         delete("name", "Loïc");
//     }
// }




// /*
//     *@BsonId: allows you to customize the ID field, see Custom IDs. Link : https://quarkus.io/guides/mongodb-panache#custom-ids
//     *@BsonProperty: customize the serialized name of the field.
//     *@BsonIgnore: ignore a field during the serialization.
// */
