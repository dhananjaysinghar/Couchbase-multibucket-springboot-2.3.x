package com.cb.demo.repo;

import com.cb.demo.model.User;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CouchbaseRepository<User, Integer> {
}
