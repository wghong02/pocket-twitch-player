package com.projects.twitch.external;

import java.util.List;

public record VideoResponse(
        List<Video> data
) {
}

