package com.example.podcastservice.models;

import lombok.*;

import java.util.List;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Podcast {
    private Integer id;
    private String name;
    List<Episode> edisodes;
}
