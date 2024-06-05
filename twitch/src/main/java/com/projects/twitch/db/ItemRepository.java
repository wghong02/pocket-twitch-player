package com.projects.twitch.db;

import com.projects.twitch.db.entity.ItemEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface ItemRepository extends ListCrudRepository<ItemEntity, Long> {


    ItemEntity findByTwitchId(String twitchId);
}

