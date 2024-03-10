package com.projects.twitch.model;

import com.projects.twitch.db.entity.ItemEntity;

public record FavoriteRequestBody(
        ItemEntity favorite
) {}

