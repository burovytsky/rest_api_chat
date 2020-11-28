package com.burovytsky.rest_api_chat.repository;

import com.burovytsky.rest_api_chat.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
}
