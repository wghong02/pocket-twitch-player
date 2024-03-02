package com.projects.twitch.external.model;

import com.projects.twitch.external.model.Game;

import java.util.List;

public record GameResponse(
        List<Game> data
) {
}

