package com.projects.twitch.external;

import java.util.List;

public record ClipResponse(
        List<Clip> data
) {
}

