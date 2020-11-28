package com.burovytsky.rest_api_chat.repository;

import com.burovytsky.rest_api_chat.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Integer> {
}
