package com.firelord.test.db.mongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TBLBookRepository extends MongoRepository<TBLBook, String>, TBLBookRepositoryEx {
    List<TBLBook> findByNameAndType(String strName, String strType);

    List<TBLBook> findByNameStartingWith(String strNamePrefix);
}