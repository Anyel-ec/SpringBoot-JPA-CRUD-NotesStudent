package top.anyel.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import top.anyel.mongo.collections.NumeroApp;
@Repository
public interface NumeroRepositoryApp  extends MongoRepository<NumeroApp, String> {


}