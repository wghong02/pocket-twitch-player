package com.projects.twitch.external;

import java.util.List;

public record StreamResponse(
        List<Stream> data
) {
}

