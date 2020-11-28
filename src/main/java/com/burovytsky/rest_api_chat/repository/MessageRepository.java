package com.burovytsky.rest_api_chat.repository;

import com.burovytsky.rest_api_chat.model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<Message, Integer> {
}
