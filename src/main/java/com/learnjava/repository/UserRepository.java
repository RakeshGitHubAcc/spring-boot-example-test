package com.learnjava.repository;

import org.springframework.data.repository.CrudRepository;

import com.learnjava.model.UserRecord;

public interface UserRepository extends CrudRepository<UserRecord, String> {
}
