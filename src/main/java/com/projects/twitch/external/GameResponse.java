package com.projects.twitch.external;

import java.util.List;

public record GameResponse(
        List<Game> data
) {
}

