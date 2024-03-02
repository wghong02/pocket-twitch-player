package com.projects.twitch.external.model;

import com.projects.twitch.external.model.Clip;

import java.util.List;

public record ClipResponse(
        List<Clip> data
) {
}

